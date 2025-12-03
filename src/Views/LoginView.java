package Views;
import Controllers.LoginController;
import Models.Employees;
import Models.EmployeesDao;

public class LoginView extends javax.swing.JFrame {
    //Instanciar clases
    Employees employee = new Employees();
    EmployeesDao employees_dao = new EmployeesDao();
    
    
    

    public LoginView() {
        initComponents();
        setSize(930,420);
        setResizable(false);
        //Controlador Login
        LoginController employee_login = new LoginController(employee, employees_dao, this);
        setTitle("Ingresar al Sistema");
        setLocationRelativeTo(null);
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_userName = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        btn_enter = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        WallPaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(40, 157, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INICIAR SESIÓN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 100, -1));

        txt_userName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_userName.setToolTipText("");
        jPanel1.add(txt_userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 210, 35));

        txt_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 210, 35));

        btn_enter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_enter.setText("Ingresar");
        btn_enter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enterActionPerformed(evt);
            }
        });
        jPanel1.add(btn_enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 210, 35));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 490, 420));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WallPaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/farmacia.jpg"))); // NOI18N
        jPanel2.add(WallPaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 420));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void btn_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_enterActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel WallPaper;
    public javax.swing.JButton btn_enter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPasswordField txt_password;
    public javax.swing.JTextField txt_userName;
    // End of variables declaration//GEN-END:variables
}
