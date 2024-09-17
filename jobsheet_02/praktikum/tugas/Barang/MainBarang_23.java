package praktikum.tugas.Barang;

public class MainBarang_23 {
    public static void main(String[] args) {
        //objek
        Barang_23 brg1 = new Barang_23("MKN001", "Mukena", 100000, 21.5f);
        Barang_23 brg2 = new Barang_23("SPT005", "Sepatu Dewasa", 180000, 45f);
        
        System.out.println("-------------------------------------");
        System.out.println("===   INFORMASI PENJUALAN BARANG  ===");
        System.out.println("-------------------------------------");
        System.out.println("> BARANG 1");
        brg1.tampilData();
        System.out.println("-------------------------------------\n");
        System.out.println("> BARANG 2");
        brg2.tampilData();
        System.out.println("-------------------------------------");
    }
}