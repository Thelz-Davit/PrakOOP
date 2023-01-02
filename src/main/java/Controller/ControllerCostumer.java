/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Costumer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Davit
 */
public class ControllerCostumer {
    ConnectionManager conMan = new ConnectionManager();
    Connection con = conMan.LogOn();
    
    public boolean insertCostumer(String id,String nama, String alamat,String email, String tlp){
        String query = "INSERT INTO costumer values "+"('" + id + "','"+nama+"','"+alamat+"','"+email+"','"+tlp+"')";
        try {
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public List<Costumer> showCostumer(){
        List<Costumer> listCostumer = new ArrayList<>();
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM costumer");
            while (rs.next()) {                
                Costumer usr = new Costumer();
                usr.setCostumer_id(rs.getString("id_costumer"));
                usr.setNama_costumer(rs.getString("nama_costumer"));
                usr.setAlamat(rs.getString("alamat"));
                usr.setEmail(rs.getString("email"));
                usr.setNotlp(rs.getString("notlp"));
                listCostumer.add(usr);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return listCostumer;
    }
    
    public boolean updateCostumer(String id,String nama, String alamat,String email, String tlp){
        String query = "UPDATE costumer SET nama_costumer= '"+nama+"', alamat = '" +alamat+ "', email='"+email+"', notlp='"+tlp+"' WHERE id_costumer = '"+id+"'";
    
        try {
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public boolean deleteCostumer(String id){
        String query = "DELETE FROM costumer WHERE id_costumer= '"+id+"'";
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
