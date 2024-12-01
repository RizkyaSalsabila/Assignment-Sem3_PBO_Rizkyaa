/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fronted;
import backend.*;

/**
 *
 * @author M.A. Naufal
 */
public class TestBackend {
    public static void main(String[] args) {
//        Kategori kat1 = new Kategori("Novel", "Koleksi buku novel");
//        Kategori kat2 = new Kategori("Referensi", "Buku referensi ilmiah");
//        Kategori kat3 = new Kategori("Komik", "Komik anak-anak");
//        // test insert
//        kat1.save();
//        kat2.save();
//        kat3.save();
//        // test update
//        kat2.setKeterangan("Koleksi buku referensi ilmiah");
//        kat2.save();
//        // test delete
//        kat3.delete();
//        // test select all
//        for(Kategori k : new Kategori().getAll()) {
//            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
//        }
//        // test search
//        for(Kategori k : new Kategori().search("ilmiah")) {
//            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
//        }
        
        
        //ANGGOTA
        Anggota agt1 = new Anggota("Rizkya Salsabila", "Sukorejo", "0857425155");
        Anggota agt2 = new Anggota("Aameena", "Pandaan", "0881627253");
        Anggota agt3 = new Anggota("Fathimah", "Suwayuwo", "0823456832");
        
        // test insert
        agt1.save();
        agt2.save();
        agt3.save();
        // test update
        agt2.setAlamat("Bangil");
        agt2.save();
        // test delete
        agt3.delete();
        // test select all
        for(Anggota a : new Anggota().getAll()) {
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat() + "Telepon: " + a.getTelepon());
        }
        // test search
        for(Anggota a: new Anggota().search("Salsabila")) {
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat() + "Telepon: " + a.getTelepon());
        }
    }
}