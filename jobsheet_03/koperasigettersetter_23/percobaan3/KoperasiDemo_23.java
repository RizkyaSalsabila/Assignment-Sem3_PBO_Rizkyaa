package koperasigettersetter_23.percobaan3;

public class KoperasiDemo_23 {
    public static void main(String[] args) {
        //objek
        Anggota_23 anggota1 = new Anggota_23();
        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Soekarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("--- Simpanan awal ---");
        System.out.println(anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("\n--- Simpanan setelah dipinjam ---");
        System.out.println(anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
    }
}