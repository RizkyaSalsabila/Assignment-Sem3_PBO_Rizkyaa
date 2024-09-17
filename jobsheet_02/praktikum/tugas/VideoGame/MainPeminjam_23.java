package praktikum.tugas.VideoGame;

public class MainPeminjam_23 {
    public static void main(String[] args) {
        PeminjamanGame_23 pjm1 = new PeminjamanGame_23(123, "Bella", "Sukorejo", "085742217634", 
        "Subwaysurf", 2, 5000, "11/09", "15/09");

        System.out.println("-------------------------------------");
        System.out.println("===        DATA PEMINJAMAN        ===");
        System.out.println("-------------------------------------");
        System.out.println("=> PEMINJAM 1");
        pjm1.tampilDataPeminjaman();
        pjm1.hitungLamaPinjam("11/09", "15/09");
        System.out.println("\n-------------------------------------");
        pjm1.totalHarga();
        System.out.println("-------------------------------------");
    }
}