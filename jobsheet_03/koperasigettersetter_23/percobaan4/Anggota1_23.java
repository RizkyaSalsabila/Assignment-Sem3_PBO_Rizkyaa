package koperasigettersetter_23.percobaan4;

public class Anggota1_23 {
    //atribut
    private String nama, alamat;
    private float simpanan;

    //konstruktor
    Anggota1_23(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.simpanan = 0;
    }

    //method 
    //setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    //setter alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    //getter nama
    public String getNama() {
        return nama;
    }

    //getter alamat
    public String getAlamat() {
        return alamat;
    }

    //getter simpanan
    public float getSimpanan() {
        return simpanan;
    }

    public void setor(float uang) {
        simpanan += uang;
    }

    public void pinjam(float uang) {
        simpanan -= uang;
    }
}