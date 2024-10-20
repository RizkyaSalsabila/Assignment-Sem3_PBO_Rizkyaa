package uts_23;

public class Penghuni extends Orang{
    //atribut
    private String nomorKamar;

    //konstruktor
    public Penghuni(String nama, String noHP, String nomorKamar) {
        super(nama, noHP);
        this.nomorKamar = nomorKamar;
    }

    //method
    public void setNoKamar(String inputNoKamar) {
        this.nomorKamar = inputNoKamar;
    }

    public String getNoKamar() {
        return nomorKamar;
    }
}