public class TampilPersegi_23 {
    public static void main(String[] args) {
        //buat objek
        Persegi_23 psg1 = new Persegi_23(5);
        Persegi_23 psg2 = new Persegi_23(8);

        //cetak setiap persegi
        System.out.println("--- Persegi 1 ---");
        psg1.dataPersegi();
        System.out.println("Luas Persegi         : " + psg1.luasPersegi());
        System.out.println("Keliling Persegi     : " + psg1.kelilingPersegi());

        System.out.println("\n--- Persegi 2 ---");
        psg2.dataPersegi();
        System.out.println("Luas Persegi         : " + psg2.luasPersegi());
        System.out.println("Keliling Persegi     : " + psg2.kelilingPersegi());
    }
}