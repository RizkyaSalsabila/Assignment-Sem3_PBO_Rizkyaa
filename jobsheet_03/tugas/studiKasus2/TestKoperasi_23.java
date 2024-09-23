package tugas.studiKasus2;
import java.util.Scanner;

public class TestKoperasi_23 {
    public static void main(String[] args) {
        int pilih = 0;
        //objek
        Anggota_23 donny = new Anggota_23("111333444", "Donny", 5000000);

        //deklarasi scanner
        Scanner input23 = new Scanner(System.in);

        System.out.println("> Selamat Datang " + donny.getNama() + " anda berhasil masuk ke sistem");
        System.out.println("> Limit peminjaman Anda sebesar : Rp " + donny.getLimitPinjaman());
        
        do {
            System.out.println("-------------------------------------");
        System.out.println("--- TES KOPERASI ----");
        System.out.println("-------------------------------------");
        System.out.println("1. Pinjam Uang");
        System.out.println("2. Bayar Angsuran");
        System.out.println("3. Keluar");
        System.out.print("\nPilih Menu (1/2/3) : ");
        pilih = input23.nextInt();
        input23.nextLine();

        switch (pilih) {
            case 1:
                System.out.println("-------------------------------------");
                System.out.println("PEMINJAMAN UANG");
                System.out.println("-------------------------------------");
                System.out.print("Masukkan uang yang akan dipinjam : ");
                int totalPinjam = input23.nextInt();
                input23.nextLine();
                donny.pinjam(totalPinjam);
                break;
            case 2:
                System.out.println("-------------------------------------");
                System.out.println("PEMBAYARAN ASURANSI");
                System.out.println("-------------------------------------");
                System.out.print("Masukkan asuransi peminjaman yang Anda bayar : ");
                int bayarAsuransi = input23.nextInt();
                input23.nextLine();
                donny.angsur(bayarAsuransi);
                break;
            case 3:
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