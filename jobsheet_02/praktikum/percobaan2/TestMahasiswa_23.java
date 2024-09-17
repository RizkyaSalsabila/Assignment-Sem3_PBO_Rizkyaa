package praktikum.percobaan2;

public class TestMahasiswa_23 {
    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        System.out.println("-------- DATA MAHASISWA --------");
        System.out.println("----------------------------------------");

        //instansiasi objek 1 mahasiswa
        Mahasiswa_23 mhs1 = new Mahasiswa_23();
        mhs1.nim = 234172056;
        mhs1.nama = "Rizkya Salsabila";
        mhs1.alamat = "Jalan Kembang Turi Gang 3A";
        mhs1.kelas = "2D - Teknik Informatika";
        mhs1.tampilBiodata();
        System.out.println(" ");

        //instansiasi objek 2 mahasiswa
        Mahasiswa_23 mhs2 = new Mahasiswa_23();
        mhs2.nim = 234172078;
        mhs2.nama = "Yasmin Naura";
        mhs2.alamat = "Jalan Senggani Gang 2C";
        mhs2.kelas = "2A - Teknik Informatika";
        mhs2.tampilBiodata();
        System.out.println(" ");

        //instansiasi objek 3 mahasiswa
        Mahasiswa_23 mhs3 = new Mahasiswa_23();
        mhs3.nim = 23417218;
        mhs3.nama = "Allfiyatur Rohmah";
        mhs3.alamat = "Jalan Remujung Gang 1F";
        mhs3.kelas = "2H - Teknik Informatika";
        mhs3.tampilBiodata();

        System.out.println("----------------------------------------");
    }
}