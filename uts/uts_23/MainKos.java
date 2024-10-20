package uts_23;
import java.util.Scanner;

public class MainKos {
    public static void main(String[] args) {
        //deklarasi scanner
        Scanner input23 = new Scanner(System.in);

        //pembuatan objek bertipe KosManajemen
        KosManajemen manajemenKos = new KosManajemen();

        //atribut
        int pilih;
        
        do {
            System.out.println("\n-------------------------------------");
            System.out.println("---     SISTEM MANAJEMEN KOS     ----");
            System.out.println("-------------------------------------");
            System.out.println("1. Input Penghuni Kos");
            System.out.println("2. Lihat Data Penghuni");
            System.out.println("3. Edit Data Penghuni");
            System.out.println("4. Hapus Data Penghuni");
            System.out.println("5. Input Pembayaran");
            System.out.println("6. Lihat Data Pembayaran");
            System.out.println("7. Keluar");
            System.out.print("\nPilih Menu (1/2/3/4/5/6/7) : ");
            pilih = input23.nextInt();
            input23.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("INPUT DATA PENGHUNI");
                    System.out.println("-------------------------------------");
                    System.out.print("> Masukkan Nama        : ");
                    String nama = input23.nextLine();
                    System.out.print("> Masukkan nomor HP    : ");
                    String nomorHP = input23.nextLine();
                    System.out.print("> Masukkan nomor kamar : ");
                    String nomorKamar = input23.nextLine();
                    
                    manajemenKos.tambahDataPenghuni(nama, nomorHP, nomorKamar);
                        break;
                case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("LIHAT DATA PENGHUNI");
                    System.out.println("-------------------------------------");
                    manajemenKos.lihatDataPenghuni();
                    break;
                case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("EDIT DATA PENGHUNI");
                    System.out.println("-------------------------------------");
                    System.out.print("> Masukkan nama penghuni sebelumnya : ");
                    String namaLama = input23.nextLine();
                    System.out.print("> Masukkan nama penghuni baru       : ");
                    String namaBaru = input23.nextLine();
                    System.out.print("> Masukkan nomor HP                 : ");
                    String nomorHPBaru = input23.nextLine();
                    System.out.print("> Masukkan ruang kamar              : ");
                    String noKamarBaru = input23.nextLine();

                    manajemenKos.editDataPenghuni(namaLama, namaBaru, nomorHPBaru, noKamarBaru);
                    break;
                case 4: 
                    System.out.println("-------------------------------------");
                    System.out.println("HAPUS DATA PENGHUNI");
                    System.out.println("-------------------------------------");
                    System.out.print("> Masukkan nama yang ingin dihapus : ");
                    String hapusNama = input23.nextLine();

                    manajemenKos.hapusDataPenghuni(hapusNama);
                    break;
                case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("INPUT DATA PEMBAYARAN");
                    System.out.println("-------------------------------------");
                    System.out.print("> Masukkan nama penghuni kos   : ");
                    String namaBayar = input23.nextLine();
                    System.out.print("> Masukkan Jumlah Uang         : ");
                    double bayar = input23.nextDouble();
                    input23.nextLine();
                    System.out.print("> Masukkan tanggal pembayaran  : ");
                    String tanggal = input23.nextLine();

                    manajemenKos.tambahDataPembayaran(namaBayar, bayar, tanggal);
                    break;
                case 6:
                    System.out.println("-------------------------------------");
                    System.out.println("LIHAT DATA PEMBAYARAN");
                    System.out.println("-------------------------------------");
                    manajemenKos.lihatDataPembayaran();
                    break;
                case 7:
                    System.out.println("-------------------------------------");
                    System.out.println("KELUAR");
                    System.out.println("-------------------------------------");
                    System.out.println("Terimakasihh...");
                    System.out.println("Anda telah keluar dari sistem.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu yang Anda inputkan tidak ada");
                    System.out.println("Silahkan coba lagi !!");
                    break;
            }
        } while (pilih != 0);

        input23.close();
    }
}