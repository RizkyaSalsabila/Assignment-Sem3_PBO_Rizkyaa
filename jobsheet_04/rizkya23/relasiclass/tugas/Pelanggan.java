package relasiclass.tugas;

public class Pelanggan {
    //atribut
    private String idPelanggan;
    private String nama;

    //konstruktor berparameter
    public Pelanggan(String idPelanggan, String nama) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
    }

    //method
    //setter
    public void setIdPelanggan(String newIdPelanggan) {
        idPelanggan = newIdPelanggan;
    }

    public void setNama(String newNama) {
        nama = newNama;
    }

    //getter
    public String getIdPelanggan() {
        return idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public String info() {
        String info = "";
        info += "ID Pelanggan : " + idPelanggan + "\n";
        info += "Nama         : " + nama + "\n";
        return info;
    }
}