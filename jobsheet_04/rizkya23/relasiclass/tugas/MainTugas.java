package relasiclass.tugas;

import java.util.Scanner;

public class MainTugas {
    public static void main(String[] args) {
        //objek pelanggan
        Pelanggan pelanggan1 = new Pelanggan("RS001", "Rizkya Salsabila");
        Pelanggan pelanggan2 = new Pelanggan("AR001", "Alfiyatur Rohmah");

        //objek kasir
        Kasir kasir1 = new Kasir("Y008", "Yasmin");
        Kasir kasir2 = new Kasir("N010", "Naura");

        //objek produk
        Produk produk1 = new Produk("BKN005", "Buku Novel", 40000);
        Produk produk2 = new Produk("P0012", "Pensil", 1000);

        //objek penjualan
        Penjualan penjualan1 = new Penjualan(pelanggan1, kasir1, produk1);
        Penjualan penjualan2 = new Penjualan(pelanggan2, kasir2, produk2);

        //deklarasi scanner
        Scanner input23 = new Scanner(System.in);
        
        int pilih = 0;
        
        do {
            System.out.println("-------------------------------------");
            System.out.println("---      APLIKASI PENJUALAN      ----");
            System.out.println("-------------------------------------");
            System.out.println("1. Informasi Detail");
            System.out.println("2. Lhat Data Pelanggan");
            System.out.println("3. Lhat Data Produk");
            System.out.println("4. Lhat Data Kasir");
            System.out.println("5. Keluar");
            System.out.print("\nPilih Menu (1/2/3/4/5) : ");
            pilih = input23.nextInt();
            input23.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("DATA PENJUALAN");
                    System.out.println("-------------------------------------");
                    System.out.println("> Menu ini menampilkan data penjualan keseluruhan");
                    System.out.println("> Mulai dari data pelanggan, produk, kasir");
                    input23.nextLine();
                    System.out.println("--- Informasi Penjualan 1 ---");
                    System.out.println(penjualan1.info());
                    System.out.println("\n--- Informasi Penjualan 2 ---");
                    System.out.println(penjualan2.info());
                    break;
                case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("DATA PELANGGAN");
                    System.out.println("-------------------------------------");
                    System.out.println("> Menu ini menampilkan data pelanggan");
                    input23.nextLine();
                    System.out.println("--- Informasi Pelanggan 1 ---");
                    System.out.println(pelanggan1.info());
                    System.out.println("\n--- Informasi Pelanggan 2 ---");
                    System.out.println(pelanggan2.info());
                    break;
                case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("DATA PRODUK");
                    System.out.println("-------------------------------------");
                    System.out.println("> Menu ini menampilkan data produk");
                    input23.nextLine();
                    System.out.println("--- Informasi Produk 1 ---");
                    System.out.println(produk1.info());
                    System.out.println("\n--- Informasi Produk 2 ---");
                    System.out.println(produk2.info());
                    break;
                case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("DATA KASIR");
                    System.out.println("-------------------------------------");
                    System.out.println("> Menu ini menampilkan data kasir");
                    input23.nextLine();
                    System.out.println("--- Informasi Kasir 1 ---");
                    System.out.println(kasir1.info());
                    System.out.println("\n--- Informasi Kasir 2 ---");
                    System.out.println(kasir2.info());
                    break;
                case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("KELUAR");
                    System.out.println("-------------------------------------");
                    System.out.println("\nTerimakasihh...");
                    System.out.println("Anda telah keluar dari sistem.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("> Menu yang Anda inputkan tidak ada");
                    System.out.println("> Silahkan coba lagi !!");
                    break;
                }
        } while (pilih != 0);   
         
    input23.close();
    }
}