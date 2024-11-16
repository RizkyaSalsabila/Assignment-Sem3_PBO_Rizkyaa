public class TestBayaran {
    public static void main(String[] args) {
        //buat objek bertipe Manajer
        Manajer man = new Manajer("Agus", 800, 50);

        //buat objek bertipe Programmer
        Programmer prog = new Programmer("Budi", 600, 30);

        //buat objek bertipe Bayaran
        Bayaran hr = new Bayaran();

        //panggil dan cetak
        System.out.println("Bayaran Manajer : " + hr.hitungBayaran(man));
        System.out.println("Bayaran Programmer : " + hr.hitungBayaran(prog));
    }
}