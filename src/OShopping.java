/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oshopping;

/**
 *
 * @author User
 */
import java.sql.Connection;
import java.sql.DriverManager;
import static java.time.Clock.system;
import javax.swing.JOptionPane;

public class OShopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       SIGNIN rgf = new SIGNIN();
        rgf.setVisible(true);
        getConnection();
    }
    static Connection getConnection()  {
         Connection con = null;
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;user=sa;password=123456;" +
            "databaseName=EShopping");
            System.out.println("Connected database successfully...");
            //return con;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return con;
        
    
}
}
