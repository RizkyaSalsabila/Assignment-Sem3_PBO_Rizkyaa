package praktikum.percobaan3;

public class TestBarang_23 {
    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        System.out.println("-------- DATA BARANG --------");
        System.out.println("----------------------------------------");

        //instansiasi objek 1 barang
        Barang_23 brg1 = new Barang_23();
        brg1.namaBrg = "Pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarang();

        //menampilkan dan mengisi argumen untuk menambahkan stok barang
        System.out.println("\nStok baru adalah " + brg1.tambahStok(20));
        System.out.println("----------------------------------------");
    }
}