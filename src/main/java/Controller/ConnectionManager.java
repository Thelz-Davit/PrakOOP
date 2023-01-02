/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Davit
 */
public class ConnectionManager {
    private Connection con;
    private String Driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3310/funcostume";
    private String Username = "root";
    private String Password = "";
    
    public Connection LogOn(){
        try {
            Class.forName(Driver).newInstance();
            con = DriverManager.getConnection(url, Username, Password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
    
    public void LogOff(){
        try {
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
