/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Baju;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
/**
 *
 * @author Davit
 */
public class ControllerBaju {
    ConnectionManager conMan = new ConnectionManager();
    Connection con = conMan.LogOn();
    
    public boolean insertBaju(String id,String nama, String kategori,String ketersediaan, String kerusakan, String kelengkapan, double harga){
        String query = "INSERT INTO baju values "+"('" + id + "','"+nama+"','"+kategori+"','"+ketersediaan+"','"+kerusakan+"','"+kelengkapan+"',"+harga+")";
        try {
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public List<Baju> showBaju(){
        List<Baju> listBaju = new ArrayList<>();
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM baju");
            while (rs.next()) {                
                Baju baju = new Baju();
                baju.setId_baju(rs.getString("id_baju"));
                baju.setNama_baju(rs.getString("nama_baju"));
                baju.setKategori(rs.getString("kategori"));
                baju.setKetersediaan(rs.getString("ketersediaan"));
                baju.setKerusakan(rs.getString("kerusakan"));
                baju.setKelengkapan(rs.getString("kelengkapan"));
                baju.setHarga(rs.getDouble("harga"));
                listBaju.add(baju);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return listBaju;
    }
    
    public boolean updateBaju(String id_baju, String nama, String kategori,String ketersediaan, String kerusakan, String kelengkapan, double harga){
        String query = "UPDATE baju SET nama_baju= '" +nama+ "', kategori = '" +kategori+ "', ketersediaan='"+ketersediaan+ "', kerusakan='"+kerusakan+ "', kelengkapan='"+kelengkapan+ "', harga="+harga+ " WHERE id_baju = '"+id_baju+"'";
        try {
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public boolean deleteBaju(String id){
        String query = "DELETE FROM baju WHERE id_baju= '"+id+"'";
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


