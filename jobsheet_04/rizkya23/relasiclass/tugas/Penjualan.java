package relasiclass.tugas;

public class Penjualan {
    //atribut
    private Pelanggan pelanggan;
    private Kasir kasir;
    private Produk produk;

    //konstruktor berparameter
    public Penjualan(Pelanggan pelanggan, Kasir kasir, Produk produk) {
        this.pelanggan = pelanggan;
        this.kasir = kasir;
        this.produk = produk;
    }

    //method
    //setter
    public void setPelanggan(Pelanggan newPelanggan) {
        pelanggan = newPelanggan;
    }

    public void setKasir(Kasir newKasir) {
        kasir = newKasir;
    }

    public void setProduk(Produk newProduk) {
        produk = newProduk;
    }

    //getter
    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public Kasir getKasir() {
        return kasir;
    }

    public Produk getProduk() {
        return produk;
    }

    public String info() {
        String info = "";
        info += pelanggan.info() + "\n";
        info += kasir.info() + "\n";
        info += produk.info();
    
        return info;
    }
}