
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnthonyCee
 */
public class Server {
     public static Connection getConnection(){
     Connection con = null;
     
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/stockertable","root","");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
     
    }
    
    
}
