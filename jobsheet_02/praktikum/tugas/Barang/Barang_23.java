package praktikum.tugas.Barang;

public class Barang_23 {
    //atribut
    public String kode, namaBarang;
    public int hargaDasar;
    public float diskon;

    //konstruktor
    public Barang_23(String kd, String nmBarang, int hDasar, float dsk) {
        kode = kd;
        namaBarang = nmBarang;
        hargaDasar = hDasar;
        diskon = dsk;
    }

    //method
    public int hitungHargaJual() {
       float hargaJual = hargaDasar - (diskon /  100 * hargaDasar);
        return (int) hargaJual;
    }

    public void tampilData() {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Dasar : Rp" + hargaDasar);
        System.out.println("Diskon      : " + diskon + "%");
        System.out.println("Harga Jual  : Rp" + hitungHargaJual());
    }
}