
package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Models.Employees;
import Models.EmployeesDao;
import static Models.EmployeesDao.id_user;
import static Models.EmployeesDao.rol_user;
import Views.SystemView;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class EmployeesController implements ActionListener, MouseListener, KeyListener{
    private Employees employee;
    private EmployeesDao employeeDao;
    private SystemView views;
    String rol = rol_user;
    DefaultTableModel model = new DefaultTableModel();

    public EmployeesController(Employees employee, EmployeesDao employeeDao, SystemView views) {
        this.employee = employee;
        this.employeeDao = employeeDao;
        this.views = views;
        //Boton registrar empleado
        this.views.btn_register_employee.addActionListener(this);
        //Poner a la escucha la tabla
        this.views.employees_table.addMouseListener(this);
        //txt Buscar a la escucha
        this.views.txt_search_employee.addKeyListener(this);
        //Boton de modificar escucha
        this.views.btn_update_employee.addActionListener(this);
        //Boton de eliminar
        this.views.btn_delete_employee.addActionListener(this);
        //Boton de cancelar
        this.views.btn_cancel_employee.addActionListener(this);
        //Boton de modificar password
        this.views.btn_modify_data.addActionListener(this);
        
    }

    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == views.btn_register_employee){
            if(views.txt_employee_id.getText().equals("")
                || views.txt_employee_fullname.getText().equals("")
                || views.txt_employee_username.getText().equals("")
                || views.txt_employee_address.getText().equals("")
                || views.txt_employee_telephone.getText().equals("")
                || views.txt_employee_email.getText().equals("")
                || views.cmb_rol.getSelectedItem().toString().equals("")
                || String.valueOf(views.txt_employee_password.getPassword()).equals("")){
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            }else{
                employee.setId(Integer.parseInt(views.txt_employee_id.getText().trim()));
                employee.setFull_name(views.txt_employee_fullname.getText().trim());
                employee.setUsername(views.txt_employee_username.getText().trim());
                employee.setAddress(views.txt_employee_address.getText().trim());
                employee.setTelephone(views.txt_employee_telephone.getText().trim());
                employee.setEmail(views.txt_employee_email.getText().trim());
                employee.setPassword(String.valueOf(views.txt_employee_password.getPassword()));
                employee.setRol(views.cmb_rol.getSelectedItem().toString());
                
                if(employeeDao.registerEmployeeQuery(employee)){
                    cleanTable();
                    JOptionPane.showMessageDialog(null, "Empleado registrado con éxito");
                    cleanFields();
                    listAllEmployees();
                }else{
                    JOptionPane.showMessageDialog(null, "Ocurrió un error al registrar el empleado");
                }     
                }
                }else if(e.getSource()==views.btn_update_employee){
                    if(views.txt_employee_id.equals("")){
                        JOptionPane.showMessageDialog(null, "Selecciona una fila de la tabla para continuar");
                    }else{
                        if(views.txt_employee_fullname.getText().equals("")
                                ||views.txt_employee_fullname.getText().equals("")
                                ||views.cmb_rol.getSelectedItem().toString().equals("")){
                            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
                        }else{
                            employee.setId(Integer.parseInt(views.txt_employee_id.getText().trim()));
                            employee.setFull_name(views.txt_employee_fullname.getText().trim());
                            employee.setUsername(views.txt_employee_username.getText().trim());
                            employee.setAddress(views.txt_employee_address.getText().trim());
                            employee.setTelephone(views.txt_employee_telephone.getText().trim());
                            employee.setEmail(views.txt_employee_email.getText().trim());
                            employee.setPassword(String.valueOf(views.txt_employee_password.getPassword()));
                            employee.setRol(views.cmb_rol.getSelectedItem().toString());
                            if(employeeDao.updateEmployeeQuery(employee)){
                                cleanTable();
                                listAllEmployees();
                                views.btn_register_employee.setEnabled(true);
                                JOptionPane.showMessageDialog(null, "Datos modificados exitosamente");
                                cleanFields();
                            }else{
                                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al modificar el empleado");
                            }
                        }
                    }

                    
        }else if(e.getSource() == views.btn_delete_employee){
            int row = views.employees_table.getSelectedRow();
            if (row == -1){
                JOptionPane.showMessageDialog(null, "Debes seleccinoar un empleado para eliminarlo");
            }else if (views.employees_table.getValueAt(row, 0).equals(id_user)){
                JOptionPane.showMessageDialog(null, "No puede eliminar al usuario autenticado");
            }else{
                int id= Integer.parseInt(views.employees_table.getValueAt(row,0).toString());
                int question = JOptionPane.showConfirmDialog(null, "En realidad quieres eliminar este empleado");
                if(question==0 && employeeDao.deleteEmployeeQuery(id)!= false){
                    cleanTable();
                    cleanFields();
                    views.btn_register_employee.setEnabled(true);
                    views.txt_employee_password.setEnabled(true);
                    listAllEmployees();
                    JOptionPane.showMessageDialog(null, "El usuario fue eliminado con éxito");
                    
                }
            }
        }else if(e.getSource()==views.btn_cancel_employee){
            cleanFields();
            views.btn_register_employee.setEnabled(true);
            views.txt_employee_password.setEnabled(true);
            views.txt_employee_id.setEditable(true);
            views.txt_employee_id.setEnabled(true);
        }else if(e.getSource()== views.btn_modify_data){
            String password = String.valueOf(views.txt_password_modify.getPassword());
            String password_confirm = String.valueOf(views.txt_password_modify_confirm.getPassword());
            if(!password.equals("")&& !password_confirm.equals("")){
                if(password.equals(password_confirm)){
                    employee.setPassword(String.valueOf(views.txt_password_modify.getPassword()));
                    if(employeeDao.updateEmployeePassword(employee)!=false){
                        JOptionPane.showMessageDialog(null, "Se modificó correctamente el Password");
                    }else{
                        JOptionPane.showMessageDialog(null, "Ha ocurrido un error al modificar el Password");
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Los Password no coinciden");
                }
            }else{
                JOptionPane.showMessageDialog(null,"Todos los campos son obligatorios");
            }
        }
} 
                      
    
//Listar todos los empleados
    public void listAllEmployees(){
        if(rol.equals("Administrador")){
            List<Employees> list = employeeDao.listEmployeesQuery(views.txt_search_employee.getText());
            model = (DefaultTableModel) views.employees_table.getModel();
            Object[]row = new Object[7];
            for(int i=0; i<list.size();i++){
                row[0] = list.get(i).getId();
                row[1] = list.get(i).getFull_name();
                row[2] = list.get(i).getUsername();
                row[3] = list.get(i).getAddress();
                row[4] = list.get(i).getTelephone();
                row[5] = list.get(i).getEmail();
                row[6] = list.get(i).getRol();
                model.addRow(row);
                
            }
        }
    }
    //Limpiar campos
    public void cleanFields(){
        views.txt_employee_id.setText("");
        views.txt_employee_id.setEditable(true);
        views.txt_employee_fullname.setText("");
        views.txt_employee_username.setText("");
        views.txt_employee_address.setText("");
        views.txt_employee_telephone.setText("");
        views.txt_employee_email.setText("");
        views.txt_employee_password.setText("");
        views.txt_employee_password.setEnabled(true);
        views.cmb_rol.setSelectedItem(0);
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.employees_table){
            int row = views.employees_table.rowAtPoint(e.getPoint());
            views.txt_employee_id.setText(views.employees_table.getValueAt(row,0).toString());
            views.txt_employee_fullname.setText(views.employees_table.getValueAt(row,1).toString());
            views.txt_employee_username.setText(views.employees_table.getValueAt(row,2).toString());
            views.txt_employee_address.setText(views.employees_table.getValueAt(row, 3).toString());
            views.txt_employee_telephone.setText(views.employees_table.getValueAt(row, 4).toString());
            views.txt_employee_email.setText(views.employees_table.getValueAt(row, 5).toString());
            views.cmb_rol.setSelectedItem(views.employees_table.getValueAt(row, 6).toString());
            
            
            views.txt_employee_id.setEditable(false);
            views.txt_employee_password.setEnabled(false);
            views.btn_register_employee.setEnabled(false);
            
        }else if(e.getSource()==views.jLabelEmployes){
            if(rol.equals("Administrador")){
                views.jTabbedPane1.setSelectedIndex(4);
                cleanTable();
                cleanFields();
                listAllEmployees();
            }else{
                views.jTabbedPane1.setEnabledAt(4, false);
                views.jLabelEmployes.setEnabled(false);
                JOptionPane.showMessageDialog(null, "No tienes privilegios de administrador para acceder a Empleados");
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getSource()==views.txt_search_employee){
            cleanTable();
            listAllEmployees();
        }
        
        
    }
    public void cleanTable(){
        for(int i=0; i<model.getRowCount();i++){
            model.removeRow(i);
            i = i-1;
        }
    }
    
    
    
    
    
    
    
    
    
    
}
