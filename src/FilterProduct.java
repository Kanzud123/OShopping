/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oshopping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class FilterProduct extends javax.swing.JFrame {

    /**
     * Creates new form FilterProduct
     */
    public FilterProduct() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("BRANDED PRODUCT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 89, 189, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "model", "price", "catagory", "rating", "dtls", "sName", "cName"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 89, -1, 269));

        jButton2.setText("POSSIBLE TO DELIVERY");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 118, 189, -1));

        jButton3.setText("AVAILABLE IN OUR STORE NOW");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 147, -1, -1));

        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 335, 189, -1));

        jButton5.setText("BACK TO PRODUCT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 306, 189, -1));

        jButton6.setText("CLEAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 277, 189, -1));

        jButton7.setText("IMPORTED PRODUCT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 176, 189, -1));

        jButton8.setText("ALL PRODUCTS");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 205, 189, -1));

        jButton9.setText("PRICE RANGE");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 234, 189, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("FILTER PRODUCT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 26, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Documents\\NetBeansProjects\\OShopping\\src\\oshopping\\images\\4559458.jpg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=EShopping;user=sa;password=123456 ";
            Connection con = DriverManager.getConnection(url);
            Statement st = con.createStatement();
            String query1 ="SELECT p.P_ID,p.P_Model,p.P_Price,p.P_Catagories,p.P_Rating,p.P_Details,p.P_StoreName,c.CountryName\n" +
"FROM PRODUCT p JOIN COUNTRY c\n" +
"ON p.CountryCode = c.CountryCode";
            ResultSet rs=  st.executeQuery(query1);
          
            while(rs.next()){
               String pid = String.valueOf(rs.getInt("P_ID"));
               String pmodel = String.valueOf(rs.getString("P_Model"));
                String pprice = String.valueOf(rs.getInt("P_Price"));
               String pcatagory= String.valueOf(rs.getString("P_Catagories"));
                String prating= String.valueOf(rs.getInt("P_Rating"));
               String pdtls = String.valueOf(rs.getString("P_Details"));
                String pstore= String.valueOf(rs.getString("P_StoreName"));
               String cname = String.valueOf(rs.getString("CountryName"));
               String tbData[] = {pid,pmodel,pprice,pcatagory,prating,pdtls,pstore,cname};
               DefaultTableModel model = (DefaultTableModel)jTable1.getModel(); 
                model.addRow(tbData);

            }con.close();
 }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=EShopping;user=sa;password=123456 ";
            Connection con = DriverManager.getConnection(url);
            Statement st = con.createStatement();
            String query1 ="SELECT p.P_ID,p.P_Model,p.P_Price,p.P_Catagories,p.P_Rating,p.P_Details,p.P_StoreName,c.CountryName\n" +
"FROM PRODUCT p CROSS JOIN COUNTRY c";
            ResultSet rs=  st.executeQuery(query1);
          
            while(rs.next()){
               String pid = String.valueOf(rs.getInt("P_ID"));
               String pmodel = String.valueOf(rs.getString("P_Model"));
                String pprice = String.valueOf(rs.getInt("P_Price"));
               String pcatagory= String.valueOf(rs.getString("P_Catagories"));
                String prating= String.valueOf(rs.getInt("P_Rating"));
               String pdtls = String.valueOf(rs.getString("P_Details"));
                String pstore= String.valueOf(rs.getString("P_StoreName"));
               String cname = String.valueOf(rs.getString("CountryName"));
               String tbData[] = {pid,pmodel,pprice,pcatagory,prating,pdtls,pstore,cname};
               DefaultTableModel model = (DefaultTableModel)jTable1.getModel(); 
                model.addRow(tbData);

            }con.close();
 }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=EShopping;user=sa;password=123456 ";
            Connection con = DriverManager.getConnection(url);
            Statement st = con.createStatement();
            String query1 ="SELECT p.P_ID,p.P_Model,p.P_Price,p.P_Catagories,p.P_Rating,p.P_Details,p.P_StoreName,c.CountryName\n" +
"FROM PRODUCT p LEFT OUTER JOIN COUNTRY c\n" +
"ON  p.CountryCode = c.CountryCode;";
            ResultSet rs=  st.executeQuery(query1);
          
            while(rs.next()){
               String pid = String.valueOf(rs.getInt("P_ID"));
               String pmodel = String.valueOf(rs.getString("P_Model"));
                String pprice = String.valueOf(rs.getInt("P_Price"));
               String pcatagory= String.valueOf(rs.getString("P_Catagories"));
                String prating= String.valueOf(rs.getInt("P_Rating"));
               String pdtls = String.valueOf(rs.getString("P_Details"));
                String pstore= String.valueOf(rs.getString("P_StoreName"));
               String cname = String.valueOf(rs.getString("CountryName"));
               String tbData[] = {pid,pmodel,pprice,pcatagory,prating,pdtls,pstore,cname};
               DefaultTableModel model = (DefaultTableModel)jTable1.getModel(); 
                model.addRow(tbData);

            }con.close();
 }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        } 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
          setVisible(false);
        Welcome ob=new Welcome();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
          setVisible(false);
        AddProduct ob=new AddProduct();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         jTable1.setModel(new DefaultTableModel(null,new String[]{"P_ID","P_Model","P_Price","P_Catagories","P_Rating","P_Details","P_StoreName","CountryName"}));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=EShopping;user=sa;password=123456 ";
            Connection con = DriverManager.getConnection(url);
            Statement st = con.createStatement();
            String query1 ="SELECT p.P_ID,p.P_Model,p.P_Price,p.P_Catagories,p.P_Rating,p.P_Details,p.P_StoreName,c.CountryName\n" +
"FROM PRODUCT p RIGHT OUTER JOIN COUNTRY c\n" +
"ON  p.CountryCode = c.CountryCode;";
            ResultSet rs=  st.executeQuery(query1);
          
            while(rs.next()){
               String pid = String.valueOf(rs.getInt("P_ID"));
               String pmodel = String.valueOf(rs.getString("P_Model"));
                String pprice = String.valueOf(rs.getInt("P_Price"));
               String pcatagory= String.valueOf(rs.getString("P_Catagories"));
                String prating= String.valueOf(rs.getInt("P_Rating"));
               String pdtls = String.valueOf(rs.getString("P_Details"));
                String pstore= String.valueOf(rs.getString("P_StoreName"));
               String cname = String.valueOf(rs.getString("CountryName"));
               String tbData[] = {pid,pmodel,pprice,pcatagory,prating,pdtls,pstore,cname};
               DefaultTableModel model = (DefaultTableModel)jTable1.getModel(); 
                model.addRow(tbData);

            }con.close();
 }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        } 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
                try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=EShopping;user=sa;password=123456 ";
            Connection con = DriverManager.getConnection(url);
            Statement st = con.createStatement();
            String query1 ="SELECT p.P_ID,p.P_Model,p.P_Price,p.P_Catagories,p.P_Rating,p.P_Details,p.P_StoreName,c.CountryName\n" +
"FROM PRODUCT p FULL OUTER JOIN COUNTRY c\n" +
"ON  p.CountryCode = c.CountryCode;";
            ResultSet rs=  st.executeQuery(query1);
          
            while(rs.next()){
               String pid = String.valueOf(rs.getInt("P_ID"));
               String pmodel = String.valueOf(rs.getString("P_Model"));
                String pprice = String.valueOf(rs.getInt("P_Price"));
               String pcatagory= String.valueOf(rs.getString("P_Catagories"));
                String prating= String.valueOf(rs.getInt("P_Rating"));
               String pdtls = String.valueOf(rs.getString("P_Details"));
                String pstore= String.valueOf(rs.getString("P_StoreName"));
               String cname = String.valueOf(rs.getString("CountryName"));
               String tbData[] = {pid,pmodel,pprice,pcatagory,prating,pdtls,pstore,cname};
               DefaultTableModel model = (DefaultTableModel)jTable1.getModel(); 
                model.addRow(tbData);

            }con.close();
 }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }  
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
                        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=EShopping;user=sa;password=123456 ";
            Connection con = DriverManager.getConnection(url);
            Statement st = con.createStatement();
            String query1 ="SELECT c.PRICE_Id,p.P_Model,p.P_Price,p.P_Catagories,p.P_Rating,p.P_Details,p.P_StoreName\n" +
"FROM PRODUCT p JOIN PRICE c\n" +
"ON p.P_Price BETWEEN c.LOW_PRICE AND c.HIGH_PRICE";
            ResultSet rs=  st.executeQuery(query1);
          
            while(rs.next()){
               String pid = String.valueOf(rs.getInt("PRICE_Id"));
               String pmodel = String.valueOf(rs.getString("P_Model"));
                String pprice = String.valueOf(rs.getInt("P_Price"));
               String pcatagory= String.valueOf(rs.getString("P_Catagories"));
                String prating= String.valueOf(rs.getInt("P_Rating"));
               String pdtls = String.valueOf(rs.getString("P_Details"));
                String pstore= String.valueOf(rs.getString("P_StoreName"));
               
               String tbData[] = {pid,pmodel,pprice,pcatagory,prating,pdtls,pstore};
               DefaultTableModel model = (DefaultTableModel)jTable1.getModel(); 
                model.addRow(tbData);

            }con.close();
 }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        } 
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FilterProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilterProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilterProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilterProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FilterProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
