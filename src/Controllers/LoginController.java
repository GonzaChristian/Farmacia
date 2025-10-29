
package Controllers;

import Models.Employees;
import Models.EmployeesDao;
import Views.LoginView;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Views.SystemView;
import javax.swing.JOptionPane;


public class LoginController implements ActionListener{
    //Encapsular variables
    private Employees employee;
    private EmployeesDao employees_dao;
    private LoginView login_view;

    public LoginController(Employees employee, EmployeesDao employees_dao, LoginView login_view) {
        this.employee = employee;
        this.employees_dao = employees_dao;
        this.login_view = login_view;
        this.login_view.btn_enter.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){ 
        //Obteniendo los datos de la vista
        String user = login_view.txt_userName.getText().trim();
        String pass = String.valueOf(login_view.txt_password.getPassword());
        if(e.getSource() == login_view.btn_enter){
            if (!user.equals("")|| !pass.equals("")){
                employee = employees_dao.loginQuery(user, pass);
                if(employee.getRol().equals("Administrador")){
                    SystemView admin = new SystemView();
                    admin.setVisible(true);
                }else{
                    SystemView aux = new SystemView();
                    aux.setVisible(true);
                }
                this.login_view.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o Password Incorrecto");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Los campos o uno de campos está vacío");
        }
    }
    
}
