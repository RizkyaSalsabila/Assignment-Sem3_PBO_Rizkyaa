package koperasigettersetter_23.percobaan4;

public class KoperasiDemo1_23 {
    public static void main(String[] args) {
        //objek
        Anggota1_23 anggota1 = new Anggota1_23("Iwan", "Jalan Mawar");
        System.out.println("--- Simpanan awal ---");
        System.out.println(anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Soekarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("\n--- Simpanan selanjutnya ---");
        System.out.println(anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("\n--- Simpanan setelah dipinjam ---");
        System.out.println(anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
    }
}