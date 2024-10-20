package uts_23;
import java.util.ArrayList;
import java.util.Scanner;

public class KosManajemen {
    private ArrayList<Penghuni> dataPenghuni = new ArrayList<>();
    private ArrayList<Pembayaran> dataPembayaran = new ArrayList<>();

    //method tambah data penghuni  (CREATE)
    public void tambahDataPenghuni(String nama, String noHP, String nomorKamar) {
        Penghuni penghuniKos = new Penghuni(nama, noHP, nomorKamar);
        dataPenghuni.add(penghuniKos);
        System.out.println("\nInput berhasil...");
        System.out.println("Data Baru Penghuni Kos bernama " + nama);
    }

    //method lihat data penghuni   (READ)
    public void lihatDataPenghuni() {
        if (dataPenghuni.isEmpty()) {
            System.out.println("Belum ada data penghuni kos");
            return;
        }
        for (Penghuni penghuni : dataPenghuni) {
            System.out.println("Nama : " + penghuni.getNama() + ", Ruang Kamar : " + penghuni.getNoKamar());
        }
    }

    //method edit data penghuni    (UPDATE)
    public void editDataPenghuni(String namaLama, String namaBaru, String nomorHPBaru, String noKamarBaru) {
        for (Penghuni penghuni : dataPenghuni) {
            if (penghuni.getNama().equalsIgnoreCase(namaLama)) {
                penghuni.setNama(namaBaru);
                penghuni.setnoHP(nomorHPBaru);
                penghuni.setNoKamar(noKamarBaru);

                System.out.println("Nama penghuni kos baru : " + namaBaru);
                return;
            }
        }

        System.out.println("Data tidak ditemukan");
        System.out.println("Update GAGAL !");
    }

    //method hapus data penghuni    (DELETE)
    public void hapusDataPenghuni(String nama) {
        dataPenghuni.removeIf(penghuni -> penghuni.getNama().equalsIgnoreCase(nama));
        System.out.println("Data penghuni kos atas nama " + nama + " berhasil dihapus");
    }


    //PEMBAYARAN
    //method tambah data pembayaran
    public void tambahDataPembayaran(String namaPenghuni, double bayar, String tanggal) {
        for (Penghuni penghuni : dataPenghuni) {
            if (penghuni.getNama().equalsIgnoreCase(namaPenghuni)) {
                Pembayaran pembayaran = new Pembayaran(penghuni, bayar, tanggal);
                dataPembayaran.add(pembayaran);
                System.out.print("Input bayar atas nama : " + namaPenghuni);
                return;
            }
        }

        System.out.println("Penghuni Kos tidak ditemukan");
    }

    //method lihat data pembayaran
    public void lihatDataPembayaran() {
        if (dataPembayaran.isEmpty()) {
            System.out.println("Data pembayaran masih kosong");
            return;
        }
        for (Pembayaran pembayaran : dataPembayaran) {
            System.out.println(pembayaran);
        }
    }
}