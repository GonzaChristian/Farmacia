package Controllers;
import Models.Customers;
import Models.CustomersDao;
import Views.SystemView;
import java.awt.JobAttributes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CustomersController implements ActionListener{
    
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
        
        
        
    }
    
    
}
