package tugas_23;

public class MainManusia {
    public static void main(String[] args) {
        //pembuatan objek
        Manusia org1 = new Manusia();
        Manusia org2 = new Mahasiswa();
        Manusia org3 = new Dosen();

        //pemanggilan objek
        //contoh pemanggilan method yang sama, tetapi output berbeda
        org1.makan();
        org2.makan();
        org3.makan();
    }
}