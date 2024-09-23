package tugas.studiKasus2;

public class TestKoperasi_23 {
    public static void main(String[] args) {
        //objek
        Anggota_23 donny = new Anggota_23("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota    : " + donny.getNama());
        System.out.println("Limit Pinjaman  : " + donny.getLimitPinjaman());

        System.out.println("\nMeminjam uang 10.000.000...");
        donny.pinjam(10000000);
        
        System.out.println("\nMeminjam uang 4.000.000...");
        donny.pinjam(4000000);

        System.out.println("\nMembayar angsuran 200.000...");
        donny.angsur(200000);

        System.out.println("\nMembayar angsuran 3.000.000...");
        donny.angsur(3000000);
    }
}