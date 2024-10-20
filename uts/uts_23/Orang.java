package uts_23;

public class Orang {
    //atribut
    private String nama;
    private String noHP;

    //konstruktor
    public Orang(String nama, String noHP) {
        this.nama = nama;
        this.noHP = noHP;
    }

    //method
    public void setNama(String inputNama) {
        nama = inputNama;
    }

    public String getNama() {
        return nama;
    }

    public void setnoHP(String inputNoHP) {
        noHP = inputNoHP;
    }

    public String getNoHP() {
        return noHP;
    }
}