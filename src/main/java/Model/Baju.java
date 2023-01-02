/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Davit
 */
public class Baju {
    private String id_baju;
    private String nama_baju;
    private String kategori;
    private String ketersediaan;
    private String kerusakan;
    private String kelengkapan;
    private double harga;

    public Baju() {
    }

    public Baju(String id_baju, String nama_baju, String kategori, String ketersediaan, String kerusakan, String kelengkapan, double harga) {
        this.id_baju = id_baju;
        this.nama_baju = nama_baju;
        this.kategori = kategori;
        this.ketersediaan = ketersediaan;
        this.kerusakan = kerusakan;
        this.kelengkapan = kelengkapan;
        this.harga = harga;
    }

    

    public String getId_baju() {
        return id_baju;
    }

    public void setId_baju(String id_baju) {
        this.id_baju = id_baju;
    }

    public String getNama_baju() {
        return nama_baju;
    }

    public void setNama_baju(String nama_baju) {
        this.nama_baju = nama_baju;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getKetersediaan() {
        return ketersediaan;
    }

    public void setKetersediaan(String ketersediaan) {
        this.ketersediaan = ketersediaan;
    }

    public String getKerusakan() {
        return kerusakan;
    }

    public void setKerusakan(String kerusakan) {
        this.kerusakan = kerusakan;
    }

    public String getKelengkapan() {
        return kelengkapan;
    }

    public void setKelengkapan(String kelengkapan) {
        this.kelengkapan = kelengkapan;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
}
