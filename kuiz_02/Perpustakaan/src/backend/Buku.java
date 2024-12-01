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
public class Buku {
    //atribut
    private int idbuku;
    private Kategori idkategori = new Kategori();
    private String judul;
    private String penerbit;
    private String penulis;

    public int getIdbuku() {
        return idbuku;
    }

    public void setIdbuku(int idbuku) {
        this.idbuku = idbuku;
    }

    public Kategori getIdkategori() {
        return idkategori;
    }

    public void setIdkategori(Kategori idkategori) {
        this.idkategori = idkategori;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    
    //konstruktor default
    public Buku() {
        
    }

    //konstruktor berparameter
    public Buku(Kategori idkategori, String judul, String penerbit, String penulis) {
        this.idkategori = idkategori;
        this.judul = judul;
        this.penerbit = penerbit;
        this.penulis = penulis;
    }
    
    public Buku getById(int id) {
        Buku bk = new Buku();
        ResultSet rs = DBHelper.selectQuery("SELECT "
            + "    b.idbuku AS idbuku, "
            + "    b.judul AS judul, "
            + "    b.penerbit AS penerbit, "
            + "    b.penulis AS penulis, "
            + "    k.idkategori AS idkategori, "
            + "    k.nama AS nama, "
            + "    k.keterangan AS keterangan "
            + "    FROM buku b "
            + "    LEFT JOIN kategori k ON b.idkategori = k.idkategori "
            + "    WHERE b.idbuku = '" + id + "'");
        
        try {
            while(rs.next()) {
                bk = new Buku();
                bk.setIdbuku(rs.getInt("idbuku"));
                bk.getIdkategori().setIdkategori(rs.getInt("idkategori"));
                bk.getIdkategori().setNama(rs.getString("nama"));
                bk.getIdkategori().setKeterangan(rs.getString("keterangan"));
                bk.setJudul(rs.getString("judul"));
                bk.setPenerbit(rs.getString("penerbit"));
                bk.setPenulis(rs.getString("penulis"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return bk;
    }
    
    public ArrayList<Buku> getAll() {
        ArrayList<Buku> ListBuku = new ArrayList<>();
        
        ResultSet rs = DBHelper.selectQuery("SELECT "
            + "    b.idbuku AS idbuku, "
            + "    b.judul AS judul, "
            + "    b.penerbit AS penerbit, "
            + "    b.penulis AS penulis, "
            + "    k.idkategori AS idkategori, "
            + "    k.nama AS nama, "
            + "    k.keterangan AS keterangan "
            + "    FROM buku b "
            + "    LEFT JOIN kategori k ON b.idkategori = k.idkategori");
        
        try {
            while(rs.next()) {
                Buku bk = new Buku();
                bk.setIdbuku(rs.getInt("idbuku"));
                bk.getIdkategori().setIdkategori(rs.getInt("idkategori"));
                bk.getIdkategori().setNama(rs.getString("nama"));
                bk.getIdkategori().setKeterangan(rs.getString("keterangan"));
                bk.setJudul(rs.getString("judul"));
                bk.setPenerbit(rs.getString("penerbit"));
                bk.setPenulis(rs.getString("penulis"));
                ListBuku.add(bk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ListBuku;
    }
    
    public ArrayList<Buku> search(String keyword) { 
        ArrayList<Buku> ListBuku = new ArrayList<>();
        
        ResultSet rs = DBHelper.selectQuery("SELECT "
            + "    b.idbuku AS idbuku, "
            + "    b.judul AS judul, "
            + "    b.penerbit AS penerbit, "
            + "    b.penulis AS penulis, "
            + "    k.idkategori AS idkategori, "
            + "    k.nama AS nama, "
            + "    k.keterangan AS keterangan "
            + "    FROM buku b "
            + "    LEFT JOIN kategori k ON b.idkategori = k.idkategori "
            + "    WHERE b.judul LIKE '%" + keyword + "%' "
            + "       OR b.penerbit LIKE '%" + keyword + "%' "
            + "       OR b.penulis LIKE '%" + keyword + "%' ");
        
            try {
            while (rs.next()) {
                Buku bk = new Buku();
                bk.setIdbuku(rs.getInt("idbuku"));
                bk.getIdkategori().setIdkategori(rs.getInt("idkategori"));
                bk.getIdkategori().setNama(rs.getString("nama"));
                bk.getIdkategori().setKeterangan(rs.getString("keterangan"));
                bk.setJudul(rs.getString("judul"));
                bk.setPenerbit(rs.getString("penerbit"));
                bk.setPenulis(rs.getString("penulis"));
                ListBuku.add(bk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ListBuku;
    }
    //COBA AJAAA, KALO NGGAK GANTI UBAH POSISINYAAAAA
    public void save() {
        if(getById(idbuku).getIdbuku() == 0){
            String SQL = "INSERT INTO buku (judul, idkategori, penulis, penerbit) VALUES("
                + "    '" + this.judul + "', "
                + "    '" + this.getIdkategori().getIdkategori() + "', "
                + "    '" + this.penulis + "', "
                + "    '" + this.penerbit + "' "
                + "    )";
            this.idbuku = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE buku SET " 
                    + " judul = '" + this.judul + "', " 
                    + " idkategori = '" + this.getIdkategori().getIdkategori() + "', "
                    + "    penulis = '" + this.penulis + "', "
                    + "    penerbit = '" + this.penerbit + "' "
                    + "    WHERE idbuku = '" + this.idbuku + "'";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete() {
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.idbuku + "'";
        DBHelper.executeQuery(SQL);
    }
}