public class bukuFiksi extends buku {
    //atribut
    private String genre;
    private String karakterUtama;

    //method 
    public void setGenre(String dataBaru) {
        genre = dataBaru;
    }

    public void setKarakterUtama(String dataBaru) {
        karakterUtama = dataBaru;
    }

    //method cetakTambahan
    public void cetakInformasiBuku() {
        super.cetakInformasiBuku();
        System.out.println("Genre          : " + genre);
        System.out.println("Karakter Utama : " + karakterUtama);
    }
}