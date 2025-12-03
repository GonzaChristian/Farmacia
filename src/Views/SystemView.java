
package Views;
import Controllers.CategoriesController;
import Controllers.CustomersController;
import Controllers.SettingsControllers;
import Models.Employees;
import Models.EmployeesDao;
import Controllers.EmployeesController;
import Controllers.ProductsController;
import Controllers.PurchasesController;
import Controllers.SalesController;
import Controllers.SuppliersController;
import Models.Categories;
import Models.CategoriesDao;
import Models.Customers;
import Models.CustomersDao;
import Models.Products;
import Models.ProductsDao;
import Models.Purchases;
import Models.PurchasesDao;
import Models.Sales;
import Models.SalesDao;
import Models.Suppliers;
import Models.SuppliersDao;

public class SystemView extends javax.swing.JFrame {
    
    //Crear instancias
    
    //Empleados
    Employees employee = new Employees();
    EmployeesDao employeesDao = new EmployeesDao();
    //Clientes
    Customers customer = new Customers();
    CustomersDao customersDao = new CustomersDao();
    //Proveedores
    Suppliers supplier = new Suppliers();
    SuppliersDao suppliersDao = new SuppliersDao();
    //Categoria
    Categories category = new Categories();
    CategoriesDao categoryDao = new CategoriesDao();
    //Productos
    Products product = new Products();
    ProductsDao productsDao = new ProductsDao();
    //Compras
    Purchases purchase = new Purchases();
    PurchasesDao purchasesDao = new PurchasesDao();
    //Ventas
    Sales sales = new Sales();
    SalesDao salesDao = new SalesDao();
    
    

    public SystemView() {
        initComponents();
        setSize(1208,680);
        setResizable(false);
        setTitle("Panel de Administración");
        setLocationRelativeTo(null);
        //Controlador de Settings
        SettingsControllers setting = new SettingsControllers(this);
        this.repaint();
        //Controlador de empleados
        EmployeesController employee_account = new EmployeesController(employee, employeesDao,this);
        employee_account.listAllEmployees();
        //Controlador de clientes
        CustomersController customer_account = new CustomersController(customer, customersDao,this);
        customer_account.listAllCustomers();
        //Controlador proveedor
        SuppliersController supplier_account = new SuppliersController(supplier,suppliersDao,this);
        supplier_account.listAllSuppliers();
        //Controlador Categorias
        CategoriesController category_section = new CategoriesController(category,categoryDao,this);
        category_section.listAllCategories();
        //Produtos controlador
        ProductsController product_section = new ProductsController(product,productsDao,this);
        product_section.listAllProducts();
        //Compras
        PurchasesController purchase_section = new PurchasesController(purchase,purchasesDao,this);
        //Ventas
        SalesController salesSection  = new SalesController(sales,salesDao,this);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Cabecera = new javax.swing.JPanel();
        btn_photo = new javax.swing.JButton();
        btn_loginOut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_product_code = new javax.swing.JTextField();
        txt_product_name = new javax.swing.JTextField();
        txt_product_unit_price = new javax.swing.JTextField();
        txt_product_description = new javax.swing.JTextField();
        txt_product_id = new javax.swing.JTextField();
        btn_register_product = new javax.swing.JButton();
        btn_update_product = new javax.swing.JButton();
        btn_delete_product = new javax.swing.JButton();
        btn_cancel_product = new javax.swing.JButton();
        cmb_product_category = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txt_search_product = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        products_table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_purchase_product_code = new javax.swing.JTextField();
        txt_purchase_product_name = new javax.swing.JTextField();
        txt_purchase_amount = new javax.swing.JTextField();
        cmb_purchase_supplier = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_purchase_price = new javax.swing.JTextField();
        txt_purchase_subtotal = new javax.swing.JTextField();
        txt_purchase_id = new javax.swing.JTextField();
        txt_purchase_total_to_pay = new javax.swing.JTextField();
        btn_add_product_to_buy = new javax.swing.JButton();
        btn_confirm_purchase = new javax.swing.JButton();
        btn_remove_purchase = new javax.swing.JButton();
        btn_new_purchase = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        purchases_table = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        txt_sale_product_code = new javax.swing.JTextField();
        txt_sale_product_name = new javax.swing.JTextField();
        txt_sale_quantity = new javax.swing.JTextField();
        txt_sale_customer_id = new javax.swing.JTextField();
        txt_sale_total_to_pay = new javax.swing.JTextField();
        txt_sale_product_id = new javax.swing.JTextField();
        txt_sale_price = new javax.swing.JTextField();
        txt_sale_subtotal = new javax.swing.JTextField();
        txt_sale_stock = new javax.swing.JTextField();
        txt_sale_customer_name = new javax.swing.JTextField();
        btn_add_product_sale = new javax.swing.JButton();
        btn_confirm_sale = new javax.swing.JButton();
        btn_remove_sale = new javax.swing.JButton();
        btn_new_sale = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        sales_table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_customer_id = new javax.swing.JTextField();
        txt_customer_fullname = new javax.swing.JTextField();
        txt_customer_address = new javax.swing.JTextField();
        txt_customer_telephone = new javax.swing.JTextField();
        txt_customer_email = new javax.swing.JTextField();
        btn_register_customer = new javax.swing.JButton();
        btn_update_customer = new javax.swing.JButton();
        btn_delete_customer = new javax.swing.JButton();
        btn_cancel_customer = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txt_search_customers = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        customers_table = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txt_employee_id = new javax.swing.JTextField();
        txt_employee_fullname = new javax.swing.JTextField();
        txt_employee_username = new javax.swing.JTextField();
        txt_employee_address = new javax.swing.JTextField();
        cmb_rol = new javax.swing.JComboBox<>();
        txt_employee_telephone = new javax.swing.JTextField();
        txt_employee_email = new javax.swing.JTextField();
        txt_employee_password = new javax.swing.JPasswordField();
        btn_register_employee = new javax.swing.JButton();
        btn_update_employee = new javax.swing.JButton();
        btn_delete_employee = new javax.swing.JButton();
        btn_cancel_employee = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        txt_search_employee = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        employees_table = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txt_supplier_name = new javax.swing.JTextField();
        txt_supplier_address = new javax.swing.JTextField();
        txt_supplier_telephone = new javax.swing.JTextField();
        txt_supplier_email = new javax.swing.JTextField();
        txt_supplier_description = new javax.swing.JTextField();
        cmb_supplier_city = new javax.swing.JComboBox<>();
        txt_supplier_id = new javax.swing.JTextField();
        btn_register_supplier = new javax.swing.JButton();
        btn_update_supplier = new javax.swing.JButton();
        btn_delete_supplier = new javax.swing.JButton();
        btn_cancel_supplier = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        txt_search_supplier = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        suppliers_table = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txt_category_id = new javax.swing.JTextField();
        txt_category_name = new javax.swing.JTextField();
        btn_register_category = new javax.swing.JButton();
        btn_update_category = new javax.swing.JButton();
        btn_cancel_category = new javax.swing.JButton();
        btn_delete_category = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        txt_search_category = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        categories_table = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        table_all_purchases = new javax.swing.JTable();
        jLabel62 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        table_all_sales = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        txt_id_profile = new javax.swing.JTextField();
        txt_name_profile = new javax.swing.JTextField();
        txt_address_profile = new javax.swing.JTextField();
        txt_telephone_profile = new javax.swing.JTextField();
        txt_email_profile = new javax.swing.JTextField();
        txt_password_modify = new javax.swing.JPasswordField();
        txt_password_modify_confirm = new javax.swing.JPasswordField();
        btn_modify_data = new javax.swing.JButton();
        Menu = new javax.swing.JPanel();
        jPanelProducts = new javax.swing.JPanel();
        jLabelProducts = new javax.swing.JLabel();
        jPanelPurchases = new javax.swing.JPanel();
        jLabelPurchases = new javax.swing.JLabel();
        jPanelCustomers = new javax.swing.JPanel();
        jLabelCustomers = new javax.swing.JLabel();
        jPanelEmployes = new javax.swing.JPanel();
        jLabelEmployes = new javax.swing.JLabel();
        jPanelSuppliers = new javax.swing.JPanel();
        jLabelSuppliers = new javax.swing.JLabel();
        jPanelCategories = new javax.swing.JPanel();
        jLabelCategories = new javax.swing.JLabel();
        jPanelReports = new javax.swing.JPanel();
        jLabelReports = new javax.swing.JLabel();
        jPanelSetting = new javax.swing.JPanel();
        jLabelSetting = new javax.swing.JLabel();
        jPanelSales = new javax.swing.JPanel();
        jLabelSales = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setBackground(new java.awt.Color(255, 255, 255));
        Logo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        Logo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 100));

        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 100));

        Cabecera.setBackground(new java.awt.Color(18, 45, 61));
        Cabecera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/face.png"))); // NOI18N
        Cabecera.add(btn_photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 80, 65));

        btn_loginOut.setText("Salir");
        btn_loginOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginOutActionPerformed(evt);
            }
        });
        Cabecera.add(btn_loginOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 35, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Farmacia Vida Natural");
        Cabecera.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 340, 100));

        getContentPane().add(Cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1010, 100));

        jPanel1.setBackground(new java.awt.Color(152, 202, 63));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Código:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Precio de venta:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Descripción:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Categoría:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("ID:");

        txt_product_code.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_product_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_product_unit_price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_product_description.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_product_id.setEditable(false);
        txt_product_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_product_id.setEnabled(false);

        btn_register_product.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_register_product.setText("Registrar");

        btn_update_product.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_update_product.setText("Modificar");

        btn_delete_product.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_delete_product.setText("Eliminar");
        btn_delete_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_productActionPerformed(evt);
            }
        });

        btn_cancel_product.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cancel_product.setText("Cancelar");

        cmb_product_category.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_product_unit_price, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_product_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_product_code, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_product_description, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_product_id, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmb_product_category, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_register_product, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_update_product, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_delete_product, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cancel_product, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(txt_product_code, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_product_description, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_register_product, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(txt_product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update_product, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_product_category, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(txt_product_unit_price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete_product, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_product_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btn_cancel_product, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 890, 270));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Buscar:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 80, -1));

        txt_search_product.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txt_search_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 160, 30));

        products_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Codigo", "Nombre", "Descripcion", "Precio de venta", "Cantidad", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(products_table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 920, 150));

        jTabbedPane1.addTab("Productos", jPanel1);

        jPanel2.setBackground(new java.awt.Color(152, 202, 63));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nueva Compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Codigo del producto:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Nombre del producto:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Cantidad:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Proveedor:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Precio de compra:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Sub total:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Id:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Total a pagar:");

        txt_purchase_subtotal.setEditable(false);

        txt_purchase_id.setEditable(false);
        txt_purchase_id.setEnabled(false);
        txt_purchase_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_purchase_idActionPerformed(evt);
            }
        });

        txt_purchase_total_to_pay.setEditable(false);

        btn_add_product_to_buy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_add_product_to_buy.setText("Agregar");

        btn_confirm_purchase.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_confirm_purchase.setText("Comprar");

        btn_remove_purchase.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_remove_purchase.setText("Eliminar");

        btn_new_purchase.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_new_purchase.setText("Nuevo");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_purchase_product_code, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_purchase_product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_purchase_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_purchase_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(15, 15, 15)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_purchase_price, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_purchase_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_purchase_id, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_purchase_total_to_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_new_purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_remove_purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_confirm_purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add_product_to_buy, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_purchase_product_code, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txt_purchase_price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add_product_to_buy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_purchase_product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txt_purchase_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_confirm_purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_purchase_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txt_purchase_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_remove_purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cmb_purchase_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txt_purchase_total_to_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_new_purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 920, 310));

        purchases_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre del producto", "Cantidad", "Precio", "Subtotal", "Proveedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(purchases_table);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 910, 140));

        jTabbedPane1.addTab("Compras", jPanel2);

        jPanel16.setBackground(new java.awt.Color(152, 202, 63));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nueva venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel52.setText("Código del producto:");

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel53.setText("Nombre del producto:");

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel54.setText("Cantidad:");

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel55.setText("Cédula del cliente:");

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel56.setText("Total a pagar:");

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel57.setText("Id:");

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel58.setText("Precio:");

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel59.setText("Subtotal:");

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel60.setText("Stock:");

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel61.setText("Nombre del cliente:");

        txt_sale_product_code.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_sale_product_name.setEditable(false);
        txt_sale_product_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_sale_quantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_sale_customer_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_sale_total_to_pay.setEditable(false);
        txt_sale_total_to_pay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_sale_product_id.setEditable(false);
        txt_sale_product_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_sale_product_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sale_product_idActionPerformed(evt);
            }
        });

        txt_sale_price.setEditable(false);
        txt_sale_price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_sale_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sale_priceActionPerformed(evt);
            }
        });

        txt_sale_subtotal.setEditable(false);
        txt_sale_subtotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_sale_subtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sale_subtotalActionPerformed(evt);
            }
        });

        txt_sale_stock.setEditable(false);
        txt_sale_stock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_sale_customer_name.setEditable(false);
        txt_sale_customer_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btn_add_product_sale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_add_product_sale.setText("Agregar");

        btn_confirm_sale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_confirm_sale.setText("Vender");

        btn_remove_sale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_remove_sale.setText("Eliminar");

        btn_new_sale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_new_sale.setText("Nuevo");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_sale_product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sale_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sale_customer_id, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sale_total_to_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sale_product_code, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_sale_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_sale_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_sale_price, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_sale_product_id, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_sale_customer_name, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_new_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add_product_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_confirm_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_remove_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jLabel57)
                    .addComponent(txt_sale_product_code, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sale_product_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add_product_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jLabel58)
                    .addComponent(txt_sale_product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sale_price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_confirm_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jLabel59)
                    .addComponent(txt_sale_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sale_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_remove_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jLabel60)
                    .addComponent(txt_sale_customer_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sale_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_new_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jLabel61)
                    .addComponent(txt_sale_total_to_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sale_customer_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 920, 315));

        sales_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Producto", "Nombre", "Cantidad", "Precio de venta", "Subtotal", "Nombre del cliente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(sales_table);

        jPanel16.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 930, 150));

        jTabbedPane1.addTab("Ventas", jPanel16);

        jPanel3.setBackground(new java.awt.Color(152, 202, 63));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Identificacion:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Nombre completo:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Direccion:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Telefono:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Correo:");

        txt_customer_id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txt_customer_fullname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txt_customer_address.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txt_customer_telephone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txt_customer_email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btn_register_customer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_register_customer.setText("Registrar");

        btn_update_customer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_update_customer.setText("Modificar");

        btn_delete_customer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_delete_customer.setText("Eliminar");

        btn_cancel_customer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cancel_customer.setText("Cancelar");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_customer_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_customer_address, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(txt_customer_id, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_customer_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_customer_email, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cancel_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_register_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel21)
                    .addComponent(txt_customer_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_customer_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_register_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel22)
                    .addComponent(txt_customer_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_customer_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txt_customer_address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btn_cancel_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 920, 282));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Buscar:");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        txt_search_customers.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(txt_search_customers, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 160, 30));

        customers_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificacion", "Nombre", "Dirección", "Teléfono", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(customers_table);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 910, 150));

        jTabbedPane1.addTab("Clientes", jPanel3);

        jPanel4.setBackground(new java.awt.Color(152, 202, 63));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empleados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Identificacion:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Nombre completo:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Nombre de usuario:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Rol:");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Direccion:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Teléfono:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Correo:");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("Password:");

        txt_employee_id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txt_employee_fullname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txt_employee_username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txt_employee_address.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        cmb_rol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmb_rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Auxiliar" }));

        txt_employee_telephone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txt_employee_email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txt_employee_password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btn_register_employee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_register_employee.setText("Registrar");

        btn_update_employee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_update_employee.setText("Modificar");

        btn_delete_employee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_delete_employee.setText("Eliminar");

        btn_cancel_employee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cancel_employee.setText("Cancelar");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_employee_username, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_employee_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_employee_id, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_rol, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(txt_employee_email, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(txt_employee_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(txt_employee_password, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(txt_employee_address, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_register_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cancel_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_update_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_delete_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel28)
                    .addComponent(txt_employee_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_employee_address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_register_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel29)
                    .addComponent(txt_employee_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_employee_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel30)
                    .addComponent(txt_employee_username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_employee_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel31)
                    .addComponent(cmb_rol, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_employee_password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel24.getAccessibleContext().setAccessibleName("");
        jLabel25.getAccessibleContext().setAccessibleName("");
        jLabel26.getAccessibleContext().setAccessibleName("");
        jLabel27.getAccessibleContext().setAccessibleName("");

        jPanel4.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 920, 280));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("Buscar:");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));
        jPanel4.add(txt_search_employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 160, 30));

        employees_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificacion", "Nombre", "Usuario", "Direccion", "Teléfono", "Correo", "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(employees_table);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 910, 160));

        jTabbedPane1.addTab("Empleados", jPanel4);

        jPanel5.setBackground(new java.awt.Color(152, 202, 63));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proveedores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("Nombre:");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("Dirección:");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("Teléfono:");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("Correo:");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("Descripción:");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText("Ciudad:");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setText("Id:");

        txt_supplier_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_supplier_address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_supplier_telephone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_supplier_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_supplier_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_supplier_emailActionPerformed(evt);
            }
        });

        txt_supplier_description.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cmb_supplier_city.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_supplier_city.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ciudad de Mexico", "Monterrey", "Queretaro", "San Juan del Río" }));

        txt_supplier_id.setEditable(false);
        txt_supplier_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_supplier_id.setEnabled(false);

        btn_register_supplier.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_register_supplier.setText("Registrar");

        btn_update_supplier.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_update_supplier.setText("Modificar");

        btn_delete_supplier.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_delete_supplier.setText("Eliminar");

        btn_cancel_supplier.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cancel_supplier.setText("Cancelar");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_supplier_name, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_supplier_address, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_supplier_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_supplier_description, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_supplier_city, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_supplier_id, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txt_supplier_email, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cancel_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_register_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel37)
                    .addComponent(txt_supplier_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_supplier_description, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_register_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel38)
                    .addComponent(txt_supplier_address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_supplier_city, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel39)
                    .addComponent(txt_supplier_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_supplier_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txt_supplier_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 920, 270));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setText("Buscar:");
        jPanel5.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));
        jPanel5.add(txt_search_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 160, 30));

        suppliers_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Descripcion", "Direccion", "Telefono", "Correo", "Ciudad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(suppliers_table);

        jPanel5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 910, 140));

        jTabbedPane1.addTab("Proveedores", jPanel5);

        jPanel6.setBackground(new java.awt.Color(152, 202, 63));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categorias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setText("ID:");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setText("Nombre:");

        txt_category_id.setEditable(false);
        txt_category_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_category_id.setEnabled(false);

        txt_category_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btn_register_category.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_register_category.setText("Registrar");

        btn_update_category.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_update_category.setText("Modificar");

        btn_cancel_category.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cancel_category.setText("Cancelar");

        btn_delete_category.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_delete_category.setText("Eliminar");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_category_name, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txt_category_id, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_delete_category, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel_category, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_register_category, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update_category, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txt_category_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_register_category, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txt_category_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update_category, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btn_delete_category, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btn_cancel_category, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel6.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 520, 270));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setText("Buscar:");
        jPanel6.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, -1, -1));
        jPanel6.add(txt_search_category, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 290, 30));

        categories_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(categories_table);

        jPanel6.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 370, 220));

        jTabbedPane1.addTab("Categorías", jPanel6);

        jPanel7.setBackground(new java.awt.Color(152, 202, 63));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Compras realizadas");
        jPanel7.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        table_all_purchases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Factura", "Proveedor", "Total de compras", "Fecha de Compra"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(table_all_purchases);

        jPanel7.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 940, 180));

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Ventas realizadas");
        jPanel7.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        table_all_sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Factura Venta", "Cliente", "Empleado", "Total", "Fecha de venta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(table_all_sales);

        jPanel7.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 940, 200));

        jTabbedPane1.addTab("Reportes", jPanel7);

        jPanel8.setBackground(new java.awt.Color(152, 202, 63));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar perfil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setText("Identificación:");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel46.setText("Nombre:");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel47.setText("Direccion:");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel48.setText("Telefono:");

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel49.setText("Correo:");

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel50.setText("Nueva password:");

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setText("Confirmar password:");

        txt_id_profile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_id_profile.setEnabled(false);

        txt_name_profile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_name_profile.setEnabled(false);
        txt_name_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_name_profileActionPerformed(evt);
            }
        });

        txt_address_profile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_address_profile.setEnabled(false);

        txt_telephone_profile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_telephone_profile.setEnabled(false);

        txt_email_profile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_email_profile.setEnabled(false);

        txt_password_modify.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txt_password_modify_confirm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btn_modify_data.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_modify_data.setText("Modificar");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_address_profile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_name_profile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_id_profile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_email_profile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_telephone_profile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50)
                    .addComponent(jLabel51))
                .addGap(45, 45, 45)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_password_modify_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(txt_password_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(btn_modify_data)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jLabel50)
                    .addComponent(txt_id_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_password_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modify_data))
                .addGap(30, 30, 30)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jLabel51)
                    .addComponent(txt_name_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_password_modify_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(txt_address_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(txt_telephone_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(txt_email_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );

        jPanel8.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, 920, 390));

        jTabbedPane1.addTab("Perfil", jPanel8);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 1010, 580));

        Menu.setBackground(new java.awt.Color(18, 45, 61));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelProducts.setBackground(new java.awt.Color(18, 45, 61));

        jLabelProducts.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelProducts.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clientes.png"))); // NOI18N
        jLabelProducts.setText("  Productos");

        javax.swing.GroupLayout jPanelProductsLayout = new javax.swing.GroupLayout(jPanelProducts);
        jPanelProducts.setLayout(jPanelProductsLayout);
        jPanelProductsLayout.setHorizontalGroup(
            jPanelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProductsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelProducts)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanelProductsLayout.setVerticalGroup(
            jPanelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProductsLayout.createSequentialGroup()
                .addComponent(jLabelProducts)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Menu.add(jPanelProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, 35));

        jPanelPurchases.setBackground(new java.awt.Color(18, 45, 61));

        jLabelPurchases.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPurchases.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPurchases.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/compras__1_-removebg-preview.png"))); // NOI18N
        jLabelPurchases.setText("  Compras");

        javax.swing.GroupLayout jPanelPurchasesLayout = new javax.swing.GroupLayout(jPanelPurchases);
        jPanelPurchases.setLayout(jPanelPurchasesLayout);
        jPanelPurchasesLayout.setHorizontalGroup(
            jPanelPurchasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPurchasesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelPurchases)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanelPurchasesLayout.setVerticalGroup(
            jPanelPurchasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPurchasesLayout.createSequentialGroup()
                .addComponent(jLabelPurchases)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Menu.add(jPanelPurchases, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 35));

        jPanelCustomers.setBackground(new java.awt.Color(18, 45, 61));

        jLabelCustomers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCustomers.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCustomers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clientes__1_-removebg-preview.png"))); // NOI18N
        jLabelCustomers.setText("  Clientes");

        javax.swing.GroupLayout jPanelCustomersLayout = new javax.swing.GroupLayout(jPanelCustomers);
        jPanelCustomers.setLayout(jPanelCustomersLayout);
        jPanelCustomersLayout.setHorizontalGroup(
            jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomersLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelCustomers)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanelCustomersLayout.setVerticalGroup(
            jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCustomersLayout.createSequentialGroup()
                .addComponent(jLabelCustomers)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Menu.add(jPanelCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 200, 35));

        jPanelEmployes.setBackground(new java.awt.Color(18, 45, 61));

        jLabelEmployes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEmployes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmployes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/empleados.png"))); // NOI18N
        jLabelEmployes.setText("  Empleados");

        javax.swing.GroupLayout jPanelEmployesLayout = new javax.swing.GroupLayout(jPanelEmployes);
        jPanelEmployes.setLayout(jPanelEmployesLayout);
        jPanelEmployesLayout.setHorizontalGroup(
            jPanelEmployesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmployesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelEmployes)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanelEmployesLayout.setVerticalGroup(
            jPanelEmployesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEmployesLayout.createSequentialGroup()
                .addComponent(jLabelEmployes)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Menu.add(jPanelEmployes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 35));

        jPanelSuppliers.setBackground(new java.awt.Color(18, 45, 61));

        jLabelSuppliers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSuppliers.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSuppliers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/proveedor (1).png"))); // NOI18N
        jLabelSuppliers.setText("  Proveedores");

        javax.swing.GroupLayout jPanelSuppliersLayout = new javax.swing.GroupLayout(jPanelSuppliers);
        jPanelSuppliers.setLayout(jPanelSuppliersLayout);
        jPanelSuppliersLayout.setHorizontalGroup(
            jPanelSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuppliersLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelSuppliers)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanelSuppliersLayout.setVerticalGroup(
            jPanelSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuppliersLayout.createSequentialGroup()
                .addComponent(jLabelSuppliers)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Menu.add(jPanelSuppliers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 200, 35));

        jPanelCategories.setBackground(new java.awt.Color(18, 45, 61));

        jLabelCategories.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCategories.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCategories.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/categorias (1).png"))); // NOI18N
        jLabelCategories.setText("  Categorias");

        javax.swing.GroupLayout jPanelCategoriesLayout = new javax.swing.GroupLayout(jPanelCategories);
        jPanelCategories.setLayout(jPanelCategoriesLayout);
        jPanelCategoriesLayout.setHorizontalGroup(
            jPanelCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategoriesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelCategories)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanelCategoriesLayout.setVerticalGroup(
            jPanelCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCategoriesLayout.createSequentialGroup()
                .addComponent(jLabelCategories)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Menu.add(jPanelCategories, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 200, 35));

        jPanelReports.setBackground(new java.awt.Color(18, 45, 61));

        jLabelReports.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelReports.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reportes (1).png"))); // NOI18N
        jLabelReports.setText("  Reportes");

        javax.swing.GroupLayout jPanelReportsLayout = new javax.swing.GroupLayout(jPanelReports);
        jPanelReports.setLayout(jPanelReportsLayout);
        jPanelReportsLayout.setHorizontalGroup(
            jPanelReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReportsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelReports)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanelReportsLayout.setVerticalGroup(
            jPanelReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelReportsLayout.createSequentialGroup()
                .addComponent(jLabelReports)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Menu.add(jPanelReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 200, 35));

        jPanelSetting.setBackground(new java.awt.Color(18, 45, 61));

        jLabelSetting.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSetting.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/configuraciones (1).png"))); // NOI18N
        jLabelSetting.setText("  Configuraciones");

        javax.swing.GroupLayout jPanelSettingLayout = new javax.swing.GroupLayout(jPanelSetting);
        jPanelSetting.setLayout(jPanelSettingLayout);
        jPanelSettingLayout.setHorizontalGroup(
            jPanelSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSettingLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelSetting)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanelSettingLayout.setVerticalGroup(
            jPanelSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Menu.add(jPanelSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 200, 35));

        jPanelSales.setBackground(new java.awt.Color(18, 45, 61));

        jLabelSales.setBackground(new java.awt.Color(18, 45, 61));
        jLabelSales.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSales.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ventas.png"))); // NOI18N
        jLabelSales.setText("   Ventas");
        jLabelSales.setToolTipText("");

        javax.swing.GroupLayout jPanelSalesLayout = new javax.swing.GroupLayout(jPanelSales);
        jPanelSales.setLayout(jPanelSalesLayout);
        jPanelSalesLayout.setHorizontalGroup(
            jPanelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSalesLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabelSales, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelSalesLayout.setVerticalGroup(
            jPanelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSales, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        Menu.add(jPanelSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, 35));

        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_delete_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_productActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_delete_productActionPerformed

    private void txt_purchase_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_purchase_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_purchase_idActionPerformed

    private void txt_supplier_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_supplier_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_supplier_emailActionPerformed

    private void txt_name_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_name_profileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_name_profileActionPerformed

    private void btn_loginOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginOutActionPerformed
        if(evt.getSource()==btn_loginOut){
            dispose();
            LoginView login = new LoginView();
            login.setVisible(true);
        }
    }//GEN-LAST:event_btn_loginOutActionPerformed

    private void txt_sale_product_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sale_product_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sale_product_idActionPerformed

    private void txt_sale_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sale_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sale_priceActionPerformed

    private void txt_sale_subtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sale_subtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sale_subtotalActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cabecera;
    private javax.swing.JPanel Logo;
    private javax.swing.JPanel Menu;
    public javax.swing.JButton btn_add_product_sale;
    public javax.swing.JButton btn_add_product_to_buy;
    public javax.swing.JButton btn_cancel_category;
    public javax.swing.JButton btn_cancel_customer;
    public javax.swing.JButton btn_cancel_employee;
    public javax.swing.JButton btn_cancel_product;
    public javax.swing.JButton btn_cancel_supplier;
    public javax.swing.JButton btn_confirm_purchase;
    public javax.swing.JButton btn_confirm_sale;
    public javax.swing.JButton btn_delete_category;
    public javax.swing.JButton btn_delete_customer;
    public javax.swing.JButton btn_delete_employee;
    public javax.swing.JButton btn_delete_product;
    public javax.swing.JButton btn_delete_supplier;
    private javax.swing.JButton btn_loginOut;
    public javax.swing.JButton btn_modify_data;
    public javax.swing.JButton btn_new_purchase;
    public javax.swing.JButton btn_new_sale;
    private javax.swing.JButton btn_photo;
    public javax.swing.JButton btn_register_category;
    public javax.swing.JButton btn_register_customer;
    public javax.swing.JButton btn_register_employee;
    public javax.swing.JButton btn_register_product;
    public javax.swing.JButton btn_register_supplier;
    public javax.swing.JButton btn_remove_purchase;
    public javax.swing.JButton btn_remove_sale;
    public javax.swing.JButton btn_update_category;
    public javax.swing.JButton btn_update_customer;
    public javax.swing.JButton btn_update_employee;
    public javax.swing.JButton btn_update_product;
    public javax.swing.JButton btn_update_supplier;
    public javax.swing.JTable categories_table;
    public javax.swing.JComboBox<Object> cmb_product_category;
    public javax.swing.JComboBox<Object> cmb_purchase_supplier;
    public javax.swing.JComboBox<String> cmb_rol;
    public javax.swing.JComboBox<String> cmb_supplier_city;
    public javax.swing.JTable customers_table;
    public javax.swing.JTable employees_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel jLabelCategories;
    public javax.swing.JLabel jLabelCustomers;
    public javax.swing.JLabel jLabelEmployes;
    public javax.swing.JLabel jLabelProducts;
    public javax.swing.JLabel jLabelPurchases;
    public javax.swing.JLabel jLabelReports;
    public javax.swing.JLabel jLabelSales;
    public javax.swing.JLabel jLabelSetting;
    public javax.swing.JLabel jLabelSuppliers;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JPanel jPanelCategories;
    public javax.swing.JPanel jPanelCustomers;
    public javax.swing.JPanel jPanelEmployes;
    public javax.swing.JPanel jPanelProducts;
    public javax.swing.JPanel jPanelPurchases;
    public javax.swing.JPanel jPanelReports;
    public javax.swing.JPanel jPanelSales;
    public javax.swing.JPanel jPanelSetting;
    public javax.swing.JPanel jPanelSuppliers;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    public javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable products_table;
    public javax.swing.JTable purchases_table;
    public javax.swing.JTable sales_table;
    public javax.swing.JTable suppliers_table;
    public javax.swing.JTable table_all_purchases;
    public javax.swing.JTable table_all_sales;
    public javax.swing.JTextField txt_address_profile;
    public javax.swing.JTextField txt_category_id;
    public javax.swing.JTextField txt_category_name;
    public javax.swing.JTextField txt_customer_address;
    public javax.swing.JTextField txt_customer_email;
    public javax.swing.JTextField txt_customer_fullname;
    public javax.swing.JTextField txt_customer_id;
    public javax.swing.JTextField txt_customer_telephone;
    public javax.swing.JTextField txt_email_profile;
    public javax.swing.JTextField txt_employee_address;
    public javax.swing.JTextField txt_employee_email;
    public javax.swing.JTextField txt_employee_fullname;
    public javax.swing.JTextField txt_employee_id;
    public javax.swing.JPasswordField txt_employee_password;
    public javax.swing.JTextField txt_employee_telephone;
    public javax.swing.JTextField txt_employee_username;
    public javax.swing.JTextField txt_id_profile;
    public javax.swing.JTextField txt_name_profile;
    public javax.swing.JPasswordField txt_password_modify;
    public javax.swing.JPasswordField txt_password_modify_confirm;
    public javax.swing.JTextField txt_product_code;
    public javax.swing.JTextField txt_product_description;
    public javax.swing.JTextField txt_product_id;
    public javax.swing.JTextField txt_product_name;
    public javax.swing.JTextField txt_product_unit_price;
    public javax.swing.JTextField txt_purchase_amount;
    public javax.swing.JTextField txt_purchase_id;
    public javax.swing.JTextField txt_purchase_price;
    public javax.swing.JTextField txt_purchase_product_code;
    public javax.swing.JTextField txt_purchase_product_name;
    public javax.swing.JTextField txt_purchase_subtotal;
    public javax.swing.JTextField txt_purchase_total_to_pay;
    public javax.swing.JTextField txt_sale_customer_id;
    public javax.swing.JTextField txt_sale_customer_name;
    public javax.swing.JTextField txt_sale_price;
    public javax.swing.JTextField txt_sale_product_code;
    public javax.swing.JTextField txt_sale_product_id;
    public javax.swing.JTextField txt_sale_product_name;
    public javax.swing.JTextField txt_sale_quantity;
    public javax.swing.JTextField txt_sale_stock;
    public javax.swing.JTextField txt_sale_subtotal;
    public javax.swing.JTextField txt_sale_total_to_pay;
    public javax.swing.JTextField txt_search_category;
    public javax.swing.JTextField txt_search_customers;
    public javax.swing.JTextField txt_search_employee;
    public javax.swing.JTextField txt_search_product;
    public javax.swing.JTextField txt_search_supplier;
    public javax.swing.JTextField txt_supplier_address;
    public javax.swing.JTextField txt_supplier_description;
    public javax.swing.JTextField txt_supplier_email;
    public javax.swing.JTextField txt_supplier_id;
    public javax.swing.JTextField txt_supplier_name;
    public javax.swing.JTextField txt_supplier_telephone;
    public javax.swing.JTextField txt_telephone_profile;
    // End of variables declaration//GEN-END:variables
}
