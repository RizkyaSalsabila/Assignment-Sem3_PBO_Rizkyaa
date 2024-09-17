package praktikum.tugas.Lingkaran;

public class TampilLingkaran_23 {
    public static void main(String[] args) {
        //objek
        HitungLingkaran_23 lkr1 = new HitungLingkaran_23(7.0);
        HitungLingkaran_23 lkr2 = new HitungLingkaran_23(9.0);

        System.out.println("-------------------------------------");
        System.out.println("===        HITUNG LINGKARAN       ===");
        System.out.println("-------------------------------------");
        System.out.println("> LINGKARAN 1");
        System.out.println("Jari - jari : " + lkr1.r);
        System.out.println("Luas        : " + lkr1.hitungLuas());
        System.out.println("Keliling    : " + lkr1.hitungKeliling());
        System.out.println("-------------------------------------\n");
        System.out.println("> LINGKARAN 2");
        System.out.println("Jari - jari : " + lkr2.r);
        System.out.println("Luas        : " + lkr2.hitungLuas());
        System.out.println("Keliling    : " + lkr2.hitungKeliling());
        System.out.println("-------------------------------------");
    }
}