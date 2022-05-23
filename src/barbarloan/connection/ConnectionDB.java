/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbarloan.connection;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ansori San
 */
public class ConnectionDB {
    public static Connection mysqlConfig;
    public static Connection conn()throws SQLException{
        try{
            String url = "jdbc:mysql://localhost/java_corp";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlConfig = DriverManager.getConnection(url, user, pass);
//            JOptionPane.showMessageDialog(null, "connected");
        } catch(Exception e){
           JOptionPane.showMessageDialog(null, "connection failed");
           System.err.println("connection failed "+e.getMessage());
        }
        
        return mysqlConfig;
    }
}
