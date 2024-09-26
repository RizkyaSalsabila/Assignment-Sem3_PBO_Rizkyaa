public class Sopir {
    //atribut
    private String nama;
    private int biaya;

    //konstruktor default
    public Sopir() {

    }

    //konstruktor berparameter
    public Sopir(String nama, int biaya) {
        this.nama = nama;
        this.biaya = biaya;
    }

    //method
    //setter
    public void setNama(String newNama) {
        nama = newNama;
    }

    public void setBiaya(int newBiaya) {
        biaya = newBiaya;
    }

    //getter
    public String getNama() {
        return nama;
    }

    public double getBiaya() {
        return biaya;
    }

    public int hitungBiayaSopir (int hari) {
        return biaya * hari;
    }
}