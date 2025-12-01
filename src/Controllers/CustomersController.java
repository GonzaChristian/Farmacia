package Controllers;
import Models.Customers;
import Models.CustomersDao;
import Views.SystemView;
import java.awt.JobAttributes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CustomersController implements ActionListener, MouseListener, KeyListener{
    
    //Encapsular Variables
    private Customers customer;
    private CustomersDao customersDao;
    private SystemView views;
    DefaultTableModel model = new DefaultTableModel();

    //Constructor
    public CustomersController(Customers customer, CustomersDao customersDao, SystemView views) {
        this.customer = customer;
        this.customersDao = customersDao;
        this.views = views;
        //Boton Registrar Cliente "Escucha"
        this.views.btn_register_customer.addActionListener(this);
        //Tabla
        this.views.customers_table.addMouseListener(this);
        //Buscador
        this.views.txt_search_customers.addKeyListener(this);
        //Modificar Btn
        this.views.btn_update_customer.addActionListener(this);
        //Eliminar
        this.views.btn_delete_customer.addActionListener(this);
        //Cancelar
        this.views.btn_cancel_customer.addActionListener(this);
        //Clientes JLabel
        this.views.jLabelCustomers.addMouseListener(this);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== views.btn_register_customer){
            if(views.txt_customer_id.getText().equals("")
                    ||views.txt_customer_fullname.getText().equals("")
                    ||views.txt_customer_address.getText().equals("")
                    ||views.txt_customer_telephone.getText().equals("")
                    ||views.txt_customer_email.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            }else{
                customer.setId(Integer.parseInt(views.txt_customer_id.getText().trim()));
                customer.setFull_name(views.txt_customer_fullname.getText().trim());
                customer.setAddress(views.txt_customer_address.getText().trim());
                customer.setEmail(views.txt_customer_email.getText().trim());
                customer.setTelephone(views.txt_customer_telephone.getText().trim());
                if(customersDao.registerCustomersQuery(customer)){
                    cleanTable();
                    cleanFields();      
                    listAllCustomers();
                    JOptionPane.showMessageDialog(null, "Cliente registrado con éxito");
                }else{
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar cliente");
                }
            }
                    
        }else if (e.getSource()== views.btn_update_customer){
            if(views.txt_customer_id.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Selecciona una fila para continuar");
            }else{
                if(views.txt_customer_id.getText().equals("") 
                    ||views.txt_customer_fullname.getText().equals("")
                    ||views.txt_customer_fullname.getText().equals("")
                    ||views.txt_customer_fullname.getText().equals("")
                    ||views.txt_customer_fullname.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Todos los campos son obligatorios");
                }else{
                        customer.setId(Integer.parseInt(views.txt_customer_id.getText().trim()));
                        customer.setFull_name(views.txt_customer_fullname.getText().trim());
                        customer.setAddress(views.txt_customer_address.getText().trim());
                        customer.setEmail(views.txt_customer_email.getText().trim());
                        customer.setTelephone(views.txt_customer_telephone.getText().trim());
                        if(customersDao.updateCustomersQuery(customer)){
                            cleanTable();
                            cleanFields();
                            listAllCustomers();
                            views.btn_register_customer.setEnabled(true);
                            JOptionPane.showMessageDialog(null,"Datos del cliente modificados con éxito");  
                        }else{
                            JOptionPane.showMessageDialog(null,"Ha Ocurrido un error al modificar cliente");
                        }
            }
            }
                    
                    
        }else if(e.getSource() == views.btn_delete_customer){
            int row = views.customers_table.getSelectedRow();
            if (row == -1){
                JOptionPane.showMessageDialog(null,"Debes seleccionar un cliente para eliminarlo");
            }else{
                int id = Integer.parseInt(views.customers_table.getValueAt(row,0).toString());
                int question = JOptionPane.showConfirmDialog(null,"En realidad quieres eliminar este cliente");
                if (question==0 && customersDao.deleteCustomerQuery(id)!= false){
                    cleanFields();
                    cleanTable();
                    listAllCustomers();
                    views.btn_register_customer.setEnabled(true);
                    JOptionPane.showMessageDialog(null,"Cliente eliminado con éxito");
                    cleanFields();
                }
            }
        }else if(e.getSource()== views.btn_cancel_customer){
            views.btn_register_customer.setEnabled(true);
            cleanFields();
        }
    }
    
    public void cleanFields(){
        views.txt_customer_id.setText("");
        views.txt_customer_id.setEditable(true);
        views.txt_customer_fullname.setText("");
        views.txt_customer_address.setText("");
        views.txt_customer_telephone.setText("");
        views.txt_customer_email.setText("");
    }
    
    
    
    //Listar Clientes
    public void listAllCustomers(){
        List<Customers>list = customersDao.listCustomersQuery(views.txt_search_customers.getText());
        model = (DefaultTableModel) views.customers_table.getModel();
        Object[]row = new Object[5];
        for(int i=0; i<list.size();i++){
            row[0]=list.get(i).getId();
            row[1]=list.get(i).getFull_name();
            row[2]=list.get(i).getAddress();
            row[3]=list.get(i).getTelephone();
            row[4] = list.get(i).getEmail();
            model.addRow(row);
        }
        views.customers_table.setModel(model);
        
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == views.customers_table){
            int row = views.customers_table.rowAtPoint(e.getPoint());
            views.txt_customer_id.setText(views.customers_table.getValueAt(row,0).toString());
            views.txt_customer_fullname.setText(views.customers_table.getValueAt(row,1).toString());
            views.txt_customer_address.setText(views.customers_table.getValueAt(row,2).toString());
            views.txt_customer_telephone.setText(views.customers_table.getValueAt(row,3).toString());
            views.txt_customer_email.setText(views.customers_table.getValueAt(row,4).toString());
            
            views.btn_register_customer.setEnabled(false);
            views.txt_customer_id.setEditable(false);  
        } else if (e.getSource()== views.jLabelCustomers){
            views.jTabbedPane1.setSelectedIndex(3);
            cleanTable();
            cleanFields();
            listAllCustomers();
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
        if(e.getSource()==views.txt_search_customers){
            cleanTable();
            listAllCustomers();
        }
    }
    
    //Limpiar Tabla
    public void cleanTable(){
        for(int i=0; i<model.getRowCount();i++){
            model.removeRow(i);
            i=i-1;
        }
    }
    
    
    
    
}
