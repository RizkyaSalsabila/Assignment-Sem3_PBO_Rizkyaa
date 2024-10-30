public class TestKepegawaian {
    public static void main(String[] args) {
        //buat objek bertipe manajer
        Manajer man = new Manajer("Bill Gates", 5000000);

        //buat objek bertipe supervisor
        Supervisor spv = new Supervisor("Susanto", 1000000);

        //buat objek bertipe salesmanajer
        SalesManajer slman = new SalesManajer("Jessica", "IT", 2000000);
        //panggil dan cetak
        man.naikkanGaji();
        spv.naikkanGaji();
        slman.naikkanGaji();

        man.cetakStatus();
        spv.cetakStatus();
        slman.cetakStatus();
    }
}