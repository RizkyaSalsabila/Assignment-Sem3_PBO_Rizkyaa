package relasiclass.tugas;

public class Kasir {
    //atribut
    private String idKasir;
    private String nama;

    //konstruktor berparameter
    public Kasir(String idKasir, String nama) {
        this.idKasir = idKasir;
        this.nama = nama;
    }

    //method
    //setter
    public void setIdKasir(String newIdKasir) {
        idKasir = newIdKasir;
    }

    public void setNama(String newNama) {
        nama = newNama;
    }

    //getter
    public String getIdKasir() {
        return idKasir;
    }

    public String getNama() {
        return nama;
    }

    public String info() {
        String info = "";
        info += "ID Kasir : " + idKasir + "\n";
        info += "Nama     : " + nama + "\n";
        return info;
    }
}