package relasiclass.tugas;

public class Produk {
    //atribut
    private String idProduk;
    private String nama;
    private double harga;

    //konstruktor berparameter
    public Produk(String idProduk, String nama, double harga) {
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
    }

    //method
    //setter
    public void setIdProduk(String newIdProduk) {
        idProduk = newIdProduk;
    }

    public void setNama(String newNama) {
        nama = newNama;
    }

    public void setHarga(double newHarga) {
        harga = newHarga;
    }

    //getter
    public String getIdProduk() {
        return idProduk;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public String info() {
        String info = "";
        info += "ID Produk : " + idProduk + "\n";
        info += "Nama      : " + nama + "\n";
        info += "Harga     : Rp " + harga + "\n";
        return info;
    }
}