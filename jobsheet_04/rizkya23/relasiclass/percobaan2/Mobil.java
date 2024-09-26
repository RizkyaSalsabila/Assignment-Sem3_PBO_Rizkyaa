public class Mobil {
    //atribut
    private String merk;
    private int biaya;

    //konstruktor default
    public Mobil() {

    }

    //konstruktor berparameter
    public Mobil(String merk, int biaya) {
        this.merk = merk;
        this.biaya = biaya;
    }

    //method
    //setter
    public void setMerk(String newMerk) {
        merk = newMerk;
    }

    public void setBiaya(int newBiaya) {
        biaya = newBiaya;
    }

    //getter
    public String getMerk() {
        return merk;
    }

    public double getBiaya() {
        return biaya;
    }

    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }
}