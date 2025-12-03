package Controllers;
import static Models.EmployeesDao.address_user;
import static Models.EmployeesDao.email_user;
import static Models.EmployeesDao.full_name_user;
import static Models.EmployeesDao.id_user;
import static Models.EmployeesDao.telephone_user;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import Views.SystemView;
import java.awt.Color;

public class SettingsControllers implements MouseListener{
    private SystemView views;
    public SettingsControllers (SystemView views){
        this.views = views;
        
        this.views.jLabelProducts.addMouseListener(this);
        this.views.jLabelPurchases.addMouseListener(this);
        this.views.jLabelCustomers.addMouseListener(this);
        this.views.jLabelEmployes.addMouseListener(this);
        this.views.jLabelSuppliers.addMouseListener(this);
        this.views.jLabelCategories.addMouseListener(this);
        this.views.jLabelReports.addMouseListener(this);
        this.views.jLabelSetting.addMouseListener(this);
        this.views.jLabelSales.addMouseListener(this);
        Profile();
       
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       
      
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource()==views.jLabelProducts){
            views.jPanelProducts.setBackground(new Color(152,202,63));
        }
        else if(e.getSource()==views.jLabelPurchases){
            views.jPanelPurchases.setBackground(new Color(152,202,63));
        }
        else if(e.getSource()==views.jLabelCustomers){
            views.jPanelCustomers.setBackground(new Color(152,202,63));
        }
        else if(e.getSource()==views.jLabelEmployes){
            views.jPanelEmployes.setBackground(new Color(152,202,63));
        }
        else if(e.getSource()==views.jLabelSuppliers){
            views.jPanelSuppliers.setBackground(new Color(152,202,63));
        }
        else if(e.getSource()==views.jLabelCategories){
            views.jPanelCategories.setBackground(new Color(152,202,63));
        }
        else if(e.getSource()==views.jLabelReports){
            views.jPanelReports.setBackground(new Color(152,202,63));
        }
        else if(e.getSource()==views.jLabelSetting){
            views.jPanelSetting.setBackground(new Color(152,202,63));
        }
        else if(e.getSource()==views.jLabelSales){
            views.jPanelSales.setBackground(new Color(152,202,63));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource()==views.jLabelProducts){
            views.jPanelProducts.setBackground(new Color(18,45,61));
        }
        else if(e.getSource()==views.jLabelPurchases){
            views.jPanelPurchases.setBackground(new Color(18,45,61));
        }
        else if(e.getSource()==views.jLabelCustomers){
            views.jPanelCustomers.setBackground(new Color(18,45,61));
        }
        else if(e.getSource()==views.jLabelEmployes){
            views.jPanelEmployes.setBackground(new Color(18,45,61));
        }
        else if(e.getSource()==views.jLabelSuppliers){
            views.jPanelSuppliers.setBackground(new Color(18,45,61));
        }
        else if(e.getSource()==views.jLabelCategories){
            views.jPanelCategories.setBackground(new Color(18,45,61));
        }
        else if(e.getSource()==views.jLabelReports){
            views.jPanelReports.setBackground(new Color(18,45,61));
        }
        else if(e.getSource()==views.jLabelSetting){
            views.jPanelSetting.setBackground(new Color(18,45,61));
        }
        else if(e.getSource()==views.jLabelSales){
            views.jPanelSales.setBackground(new Color(18,45,61));
        }
    }
    
    private void Profile(){
        //Clientes JLabel
        this.views.jLabelCustomers.addMouseListener(this);
        this.views.txt_id_profile.setText(""+id_user);
        this.views.txt_name_profile.setText(full_name_user);
        this.views.txt_name_profile.setText(full_name_user);
        this.views.txt_address_profile.setText(address_user);
        this.views.txt_telephone_profile.setText(telephone_user);
        this.views.txt_email_profile.setText(email_user);
    }
    
    
    
    
    
    
}
