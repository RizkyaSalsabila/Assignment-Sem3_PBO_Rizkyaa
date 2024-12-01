/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author M.A. Naufal
 */
public class Anggota {
    //atribut
    private int idanggota;
    private String nama;
    private String alamat;
    private String telepon;

    public int getIdanggota() {
        return idanggota;
    }

    public void setIdanggota(int idanggota) {
        this.idanggota = idanggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
    
    //konstruktor default
    public Anggota() {
        
    }
    
    public Anggota(String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }
    
    public Anggota getById(int id) {
        Anggota agt = new Anggota();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota " + " WHERE idanggota = '" + id + "'");
        
        try {
            while(rs.next()) {
                agt = new Anggota();
                agt.setIdanggota(rs.getInt("idanggota"));
                agt.setNama(rs.getString("nama"));
                agt.setAlamat(rs.getString("alamat"));
                agt.setTelepon(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return agt;
    }
    
    public ArrayList<Anggota> getAll() {
        ArrayList<Anggota> ListAnggota = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota");
        
        try {
            while(rs.next()) {
                Anggota agt = new Anggota();
                agt.setIdanggota(rs.getInt("idanggota"));
                agt.setNama(rs.getString("nama"));
                agt.setAlamat(rs.getString("alamat"));
                agt.setTelepon(rs.getString("telepon"));
                
                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ListAnggota;
    }
    
    public ArrayList<Anggota> search(String keyword) {
        ArrayList<Anggota> ListAnggota = new ArrayList();
        
        String sql = "SELECT * FROM anggota WHERE " + "nama LIKE '%" + keyword + "%' " + " OR alamat LIKE '%" + keyword + "%' ";
        
        ResultSet rs = DBHelper.selectQuery(sql);
        
        try {
            while(rs.next()) {
                Anggota agt = new Anggota();
                agt.setIdanggota(rs.getInt("idanggota"));
                agt.setNama(rs.getString("nama"));
                agt.setAlamat(rs.getString("alamat"));
                agt.setTelepon(rs.getString("telepon"));
                
                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ListAnggota;
    }
    
    public void save() {
        if(getById(idanggota).getIdanggota() == 0){
            String SQL = "INSERT INTO anggota (nama, alamat, telepon) VALUES (" 
                    + " '" + this.nama + "', " 
                    + " '" + this.alamat + "', " 
                    + " '" + this.telepon + "' " 
                    + " )";
//            System.out.println(SQL); coba dikomen
            this.idanggota = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE anggota SET " 
                    + " nama = '" + this.nama + "', " 
                    + " alamat = '" + this.alamat + "', " 
                    + " telepon = '" + this.telepon + "', " 
                    + " WHERE idanggota = '" + this.idanggota + "' ";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete() {
        String SQL = "DELETE FROM anggota WHERE idanggota = '" + this.idanggota + "'";
        DBHelper.executeQuery(SQL);
    }
}