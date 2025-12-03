
package Controllers;
import Models.Categories;
import Models.DynamicComboBox;
import static Models.EmployeesDao.rol_user;
import Models.Suppliers;
import Models.SuppliersDao;
import Views.SystemView;
import java.awt.event.ActionEvent;
import  java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

    
public class SuppliersController implements  ActionListener, MouseListener, KeyListener{

    //Variables
    private Suppliers supplier;
    private SuppliersDao supplierDao;
    private SystemView views;
    String rol = rol_user;
    DefaultTableModel model = new DefaultTableModel();

    public SuppliersController(Suppliers supplier, SuppliersDao supplierDao, SystemView views) {
        this.supplier = supplier;
        this.supplierDao = supplierDao;
        this.views = views;
        //Registrar
        this.views.btn_register_supplier.addActionListener(this);
        //Tabla
        this.views.suppliers_table.addMouseListener(this);
        //Buscar
        this.views.txt_search_supplier.addKeyListener(this);
        //Modificar
        this.views.btn_update_supplier.addActionListener(this);
        //Eliminar
        this.views.btn_delete_supplier.addActionListener(this);
        //Cancelar
        this.views.btn_cancel_supplier.addActionListener(this);
        //Label Proveedores
        this.views.jLabelSuppliers.addMouseListener(this);
        getSupplierName();
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == views.btn_register_supplier){
            if(views.txt_supplier_name.getText().equals("")
                    || views.txt_supplier_description.getText().equals("")
                    || views.txt_supplier_address.getText().equals("")
                    || views.txt_supplier_telephone.getText().equals("")
                    || views.txt_supplier_email.getText().equals("")
                    || views.cmb_supplier_city.getSelectedItem().toString().equals("")){
                JOptionPane.showMessageDialog(null,"Todos los campos son obligatorios");
            }else{
                supplier.setName(views.txt_supplier_name.getText().trim());
                supplier.setDescription(views.txt_supplier_description.getText().trim());
                supplier.setAddress(views.txt_supplier_address.getText().trim());
                supplier.setTelephone(views.txt_supplier_telephone.getText().trim());
                supplier.setEmail(views.txt_supplier_email.getText().trim());
                supplier.setCity(views.cmb_supplier_city.getSelectedItem().toString());
                if(supplierDao.registerSuppliersQuery(supplier)){
                    cleanTable();
                    cleanFields();
                    listAllSuppliers();
                    JOptionPane.showMessageDialog(null,"Proveedor registrado con éxito");
                }else {
                    JOptionPane.showMessageDialog(null,"Error al registrar proveedor");
                }
            }
        }else if(e.getSource()==views.btn_update_supplier){
            if(views.txt_supplier_id.equals("")){
                JOptionPane.showMessageDialog(null,"Selecciona un proveedor para continuar");
            }else{
                if(views.txt_supplier_name.getText().equals("")
                    || views.txt_supplier_description.getText().equals("")
                    || views.txt_supplier_address.getText().equals("")
                    || views.txt_supplier_telephone.getText().equals("")
                    || views.txt_supplier_email.getText().equals("")
                    || views.cmb_supplier_city.getSelectedItem().toString().equals("")){
                JOptionPane.showMessageDialog(null,"Todos los campos son obligatorios");
            } else{
                    supplier.setName(views.txt_supplier_name.getText().trim());
                    supplier.setDescription(views.txt_supplier_description.getText().trim());
                    supplier.setAddress(views.txt_supplier_address.getText().trim());
                    supplier.setTelephone(views.txt_supplier_telephone.getText().trim());
                    supplier.setEmail(views.txt_supplier_email.getText().trim());
                    supplier.setCity(views.cmb_supplier_city.getSelectedItem().toString());
                    supplier.setId(Integer.parseInt(views.txt_supplier_id.getText().trim()));
                    
                    if(supplierDao.updateSuppliersQuery(supplier)){
                        cleanTable();
                        cleanFields();
                        listAllSuppliers();
                        JOptionPane.showMessageDialog(null,"Proveedor modificado con éxito");
                    }else{
                        JOptionPane.showMessageDialog(null,"Error al modificar proveedor");
                    }
                    
                }   
            }
            
        }else if(e.getSource()==views.btn_delete_supplier){
            int row = views.suppliers_table.getSelectedRow();
            if(row==-1){
                JOptionPane.showMessageDialog(null,"Debes seleccionar el proveedor que deseas eliminar");
            }else{
                int id= Integer.parseInt(views.suppliers_table.getValueAt(row,0).toString());
                int question= JOptionPane.showConfirmDialog(null,"En realidad quieres eliminar este proveedor");
                if(question==0 && supplierDao.deleteSuppliersQuery(id) != false){
                    cleanFields();
                    cleanTable();
                    listAllSuppliers();
                    JOptionPane.showMessageDialog(null,"Proveedor eliminado con éxito");
                }else{
                    JOptionPane.showMessageDialog(null,"Error al eliminar proveedor");
                }
            }
        }else if(e.getSource() == views.btn_cancel_supplier){
            cleanFields();
            views.btn_register_supplier.setEnabled(true);
        }
    }
    
    public void cleanFields(){
        views.txt_supplier_id.setText("");
        views.txt_supplier_id.setEditable(true);
        views.txt_supplier_name.setText("");
        views.txt_supplier_description.setText("");
        views.txt_supplier_address.setText("");
        views.txt_supplier_telephone.setText("");
        views.txt_supplier_email.setText("");
        views.cmb_supplier_city.setSelectedIndex(0);
    }
    

    //Listar Proveedores
    public void listAllSuppliers(){
        if(rol.equals("Administrador")){
            List<Suppliers> list= supplierDao.listSuppliersQuery(views.txt_search_supplier.getText());
            model = (DefaultTableModel) views.suppliers_table.getModel();
            Object[] row = new Object[7];
            for(int i=0; i< list.size();i++){
                row[0] = list.get(i).getId();
                row[1] = list.get(i).getName();
                row[2] = list.get(i).getDescription();
                row[3] = list.get(i).getAddress();
                row[4] = list.get(i).getTelephone();
                row[5] = list.get(i).getEmail();
                row[6] = list.get(i).getCity();
                model.addRow(row);
            }
            views.suppliers_table.setModel(model);
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==views.suppliers_table){
            int row = views.suppliers_table.rowAtPoint(e.getPoint());
            views.txt_supplier_id.setText(views.suppliers_table.getValueAt(row,0).toString());
            views.txt_supplier_name.setText(views.suppliers_table.getValueAt(row,1).toString());
            views.txt_supplier_description.setText(views.suppliers_table.getValueAt(row,2).toString());
            views.txt_supplier_address.setText(views.suppliers_table.getValueAt(row,3).toString());
            views.txt_supplier_telephone.setText(views.suppliers_table.getValueAt(row,4).toString());
            views.txt_supplier_email.setText(views.suppliers_table.getValueAt(row,5).toString());
            views.cmb_supplier_city.setSelectedItem(views.suppliers_table.getValueAt(row,6).toString());
            
            views.btn_register_supplier.setEnabled(false);
            views.txt_supplier_id.setEditable(false);
        }else if(e.getSource()== views.jLabelSuppliers){
            if(rol.equals("Administrador")){
                views.jTabbedPane1.setSelectedIndex(5);
                cleanFields();
                cleanTable();
                listAllSuppliers();
            }else{
                views.jTabbedPane1.setEnabledAt(5,false);
                views.jLabelSuppliers.setEnabled(false);
                JOptionPane.showMessageDialog(null,"NO tienes privilegios de administrador para acceder a esta vista");
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
        if(e.getSource()==views.txt_search_supplier){
            cleanTable();
            listAllSuppliers();
        }
    }
    
    public void cleanTable(){
        for(int i=0; i<model.getRowCount();i++){
            model.removeRow(i);
            i=i-1;
        }
    }
    
    //Mostrar el nombre de proveedor
    public void getSupplierName(){
        List<Suppliers> list = supplierDao.listSuppliersQuery(views.txt_search_supplier.getText());
        for(int i=0; i < list.size();i++){
            int id = list.get(i).getId();
            String name = list.get(i).getName();
            views.cmb_purchase_supplier.addItem(new DynamicComboBox(id,name));
        }
    }
}
