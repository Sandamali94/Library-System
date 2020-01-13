/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwithuslibmansystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author abans tangalle
 */
public class DBConnection {
    
    static Connection con; 
    static void DBConnection(){
    
        try{
        
            String host = "jdbc:mysql://localhost:3306/readwithuslibmansystem";
            String uname = "root";
            String passw = "";
            
            con = DriverManager.getConnection(host,uname,passw);
        
        }catch(SQLException ex){
        
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }   
}
