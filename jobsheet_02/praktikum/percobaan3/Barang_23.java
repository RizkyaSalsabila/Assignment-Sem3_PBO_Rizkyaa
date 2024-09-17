package praktikum.percobaan3;

public class Barang_23 {
    //atribut
    public String namaBrg, jenisBrg;
    public int stok;

    //method bertipe void
    public void tampilBarang() {
        System.out.println("Nama Barang   : " + namaBrg);
        System.out.println("Jenis Barang  : " + jenisBrg);
        System.out.println("Stok          : " + stok);
    }

    //method dengan argumen dan nilai balik (return)
    public int tambahStok(int brgMasuk) {
        int stokBaru = brgMasuk + stok;

        return stokBaru;
    }
} 