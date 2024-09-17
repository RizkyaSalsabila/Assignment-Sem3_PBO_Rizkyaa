public class bukuNonFiksi extends buku {
    //atribut
    private String topik;

    //method 
    public void setTopik(String dataBaru) {
        topik = dataBaru;
    }

    //method cetakTambahan
    public void cetakInformasiBuku() {
        super.cetakInformasiBuku();
        System.out.println("Topik          : " + topik);
    }
}