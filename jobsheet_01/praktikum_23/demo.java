public class demo {
    public static void main(String[] args) {
        //2 buah objek pewarisan buku
        bukuFiksi bk1 = new bukuFiksi();
        bukuNonFiksi bk2 = new bukuNonFiksi();

        System.out.println("Buku");
        System.out.println("--- Data Buku Fiksi ---");
        bk1.setJudul("Jalur Langit untuk capai kesuksesan");
        bk1.setPenerbit("Berkah Cahaya");
        bk1.setHalaman(78);
        bk1.setJumlah(5);
        bk1.setHarga(500000);
        bk1.setGenre("Islami");
        bk1.setKarakterUtama("Tekun dan pantang menyerah");
        bk1.cetakInformasiBuku();

        System.out.println("\n--- Data Buku Non Fiksi ---");
        bk2.setJudul("Pembudidayaan Bebek Betina");
        bk2.setPenerbit("Media Kita");
        bk2.setHalaman(50);
        bk2.setJumlah(4);
        bk2.setHarga(400000);
        bk2.setTopik("Pertanian");
        bk1.cetakInformasiBuku();

        //2 buah pewarisan kipas Angin
        kipasAnginStand kps1 = new kipasAnginStand();
        kipasAnginLangit kps2 = new kipasAnginLangit();

        System.out.println("\n\nKipas");
        System.out.println("--- Kipas Angin Stand ---");
        kps1.setMerk("Miyako");
        kps1.setHarga(150000);
        kps1.setJumlahKecepatan(3);
        kps1.setTinggi(180);
        kps1.cetakInformasiKipas();
        System.out.println("------------------------------");
        kps1.nyalakan();
        kps1.sesuaikanTinggi(150);

        System.out.println("\n--- Kipas Angin Langit ---");
        kps2.setMerk("Maspion");
        kps2.setHarga(130000);
        kps2.setJumlahKecepatan(2);
        kps2.setRemoteControl(false);
        kps2.cetakInformasiKipas();
        System.out.println("------------------------------");
        kps2.nyalakan();
        kps2.gunakanRemoteControl();

        //1 objek mahasiswa
        mahasiswa mhs1 = new mahasiswa();
        System.out.println("\n\nNama : Mahasiswa");
        mhs1.setNama("Bella");
        mhs1.setNIM(234175642);
        mhs1.setAlamat("Malang");
        mhs1.setProdi("TI");
        mhs1.cetakInformasiMahasiswa();
    }
}