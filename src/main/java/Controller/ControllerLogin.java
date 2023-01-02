/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import View.Menu;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
    /**
 *
 * @author Davit
 */
public class ControllerLogin {
    ConnectionManager conMan = new ConnectionManager();
    Connection con = conMan.LogOn();
    
    public int Login(String user, String pwd){
        int stat=0;
        Menu vh = new Menu();
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM admin WHERE username='" + user +"' AND password='"+pwd+"'");
            while (rs.next()) {                
                if (user.equals(rs.getString("username")) && pwd.equals(rs.getString("password"))) {
                    stat = 1;
                    vh.setVisible(true);
            } else {
                    stat = 0;
                }
            }
            return stat;
        } catch (Exception e) {
            return stat;
        }
    }
    
    public boolean Regiter(String user, String pwd){
        String query = "INSERT INTO admin VALUES "+"('"+user+"', '"+pwd+"')";
        try {
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
}
