package Controllers;
import Models.Customers;
import Models.CustomersDao;
import Views.SystemView;
import java.awt.JobAttributes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CustomersController implements ActionListener, MouseListener{
    
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
        this.views.customer_table.addMouseListener(this);
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
                    JOptionPane.showMessageDialog(null, "Cliente registrado con éxito");
                }else{
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar cliente");
                }
            }
                    
        }
    }
    
    //Listar Clientes
    public void listAllCustomers(){
        List<Customers>list = customersDao.listCustomersQuery(views.txt_search_customer.getText());
        model = (DefaultTableModel) views.customer_table.getModel();
        Object[]row = new Object[5];
        for(int i=0; i<list.size();i++){
            row[0]=list.get(i).getId();
            row[1]=list.get(i).getFull_name();
            row[2]=list.get(i).getAddress();
            row[3]=list.get(i).getTelephone();
            row[4] = list.get(i).getEmail();
            model.addRow(row);
        }
        views.customer_table.setModel(model);
        
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == views.customers_table){
            int row = views.customer_table.row
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
