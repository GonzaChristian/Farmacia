package Controllers;

import Models.DynamicComboBox;
import static Models.EmployeesDao.rol_user;
import Models.Products;
import Models.ProductsDao;
import Views.SystemView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProductsController implements ActionListener, MouseListener, KeyListener {

    private Products product;
    private ProductsDao productsDao;
    private SystemView views;
    String rol = rol_user;
    DefaultTableModel model = new DefaultTableModel();

    public ProductsController(Products product, ProductsDao productsDao, SystemView views) {
        this.product = product;
        this.productsDao = productsDao;
        this.views = views;
        //Registrar
        this.views.btn_register_product.addActionListener(this);
        //Tabla
        this.views.products_table.addMouseListener(this);
        //Buscar
        this.views.txt_search_product.addKeyListener(this);
        //Modificar
        this.views.btn_update_product.addActionListener(this);
        //Eliminar
        this.views.btn_delete_product.addActionListener(this);
        //Cancelar
        this.views.btn_cancel_product.addActionListener(this);
        //Label
        this.views.jLabelProducts.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btn_register_product) {
            if (views.txt_product_code.getText().equals("")
                    || views.txt_product_name.getText().equals("")
                    || views.txt_product_description.getText().equals("")
                    || views.txt_product_unit_price.getText().equals("")
                    || views.cmb_product_category.getSelectedItem().toString().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                product.setCode(Integer.parseInt(views.txt_product_code.getText()));
                product.setName(views.txt_product_name.getText().trim());
                product.setDescription(views.txt_product_description.getText().trim());
                product.setUnit_price(Double.parseDouble(views.txt_product_unit_price.getText()));
                DynamicComboBox category_id = (DynamicComboBox) views.cmb_product_category.getSelectedItem();
                product.setCategory_id(category_id.getId());
                if (productsDao.registerProductsQuery(product)) {
                    cleanTable();
                    cleanFields();
                    listAllProducts();
                    JOptionPane.showMessageDialog(null, "Producto registrado con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar producto");
                }
            }
        } else if (e.getSource() == views.btn_update_product) {
            if (views.txt_product_code.getText().equals("")
                    || views.txt_product_name.getText().equals("")
                    || views.txt_product_description.getText().equals("")
                    || views.txt_product_unit_price.getText().equals("")
                    || views.cmb_product_category.getSelectedItem().toString().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                product.setCode(Integer.parseInt(views.txt_product_code.getText()));
                product.setName(views.txt_product_name.getText().trim());
                product.setDescription(views.txt_product_description.getText().trim());
                product.setUnit_price(Double.parseDouble(views.txt_product_unit_price.getText()));
                DynamicComboBox category_id = (DynamicComboBox) views.cmb_product_category.getSelectedItem();
                product.setCategory_id(category_id.getId());
                product.setId(Integer.parseInt(views.txt_product_id.getText()));
                if(productsDao.updateProductQuery(product)){
                    cleanTable();
                    cleanFields();
                    listAllProducts();
                    JOptionPane.showMessageDialog(null,"Producto modificado con éxito");
                }else{
                    JOptionPane.showMessageDialog(null,"Error al modificar el producto");
                }
            }
            }else if(e.getSource()== views.btn_delete_product){
                int row = views.products_table.getSelectedRow();
                if(row==-1){
                    JOptionPane.showMessageDialog(null,"Debes seleccionar un producto para poder eliminarlo");
                }else {
                    int id = Integer.parseInt(views.products_table.getValueAt(row, 0).toString());
                    int question = JOptionPane.showConfirmDialog(null,"En realidad quieres eliminar este producto");
                    if (question ==0 && productsDao.deleteProductQuery(id) != false){
                        cleanFields();
                        cleanTable();
                        listAllProducts();
                        views.btn_register_product.setEnabled(true);
                        JOptionPane.showMessageDialog(null,"Producto eliminado con éxito");
                    } else {
                        JOptionPane.showMessageDialog(null,"Error al eliminar el producto");
                    }
                }
            }else if(e.getSource() == views.btn_cancel_product){
                cleanFields();
                views.btn_register_product.setEnabled(true);
            }
        }
    
    public void cleanFields(){
        views.txt_product_id.setText("");
        views.txt_product_code.setText("");
        views.txt_product_name.setText("");
        views.txt_product_description.setText("");
        views.txt_product_unit_price.setText("");
    }

    

    public void listAllProducts() {
        if (rol.equals("Administrador") || rol.equals("Auxiliar")) {
            List<Products> list = productsDao.listProductsQuery(views.txt_search_product.getText());
            model = (DefaultTableModel) views.products_table.getModel();
            Object[] row = new Object[7];
            for (int i = 0; i < list.size(); i++) {
                row[0] = list.get(i).getId();
                row[1] = list.get(i).getCode();
                row[2] = list.get(i).getName();
                row[3] = list.get(i).getDescription();
                row[4] = list.get(i).getUnit_price();
                row[5] = list.get(i).getProduct_quantity();
                row[6] = list.get(i).getCategory_name();
                model.addRow(row);
            }
            views.products_table.setModel(model);
            if (rol.equals("Auxiliar")) {
                views.btn_register_product.setEnabled(false);
                views.btn_update_product.setEnabled(false);
                views.btn_delete_product.setEnabled(false);
                views.btn_cancel_product.setEnabled(false);
                views.txt_product_code.setEnabled(false);
                views.txt_product_description.setEnabled(false);
                views.txt_product_id.setEnabled(false);
                views.txt_product_name.setEnabled(false);
                views.txt_product_unit_price.setEnabled(false);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.products_table) {
            int row = views.products_table.rowAtPoint(e.getPoint());
            views.txt_product_id.setText(views.products_table.getValueAt(row, 0).toString());
            product = productsDao.searchProduct(Integer.parseInt(views.txt_product_id.getText()));
            views.txt_product_code.setText("" + product.getCode());
            views.txt_product_name.setText(product.getName());
            views.txt_product_description.setText(product.getDescription());
            views.txt_product_unit_price.setText("" + product.getUnit_price());
            views.cmb_product_category.setSelectedItem(new DynamicComboBox(product.getCategory_id(), product.getCategory_name()));
            views.btn_register_product.setEnabled(false);
        }else if(e.getSource()==views.jLabelProducts){
            views.jTabbedPane1.setSelectedIndex(0);
            cleanFields();
            cleanTable();
            listAllProducts();
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
        if (e.getSource() == views.txt_search_product) {
            cleanTable();
            listAllProducts();
        }
    }

    public void cleanTable() {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }

}
