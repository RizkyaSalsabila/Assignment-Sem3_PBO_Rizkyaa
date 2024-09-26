public class Pelanggan {
    //atribut
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;

    //konstruktor default
    public Pelanggan() {

    }

    //method
    //setter
    public void setNama(String newNama) {
        nama = newNama;
    }

    public void setMobil(Mobil newMobil) {
        mobil = newMobil;
    }

    public void setSopir(Sopir newSopir) {
        sopir = newSopir;
    }

    public void setHari(int newHari) {
        hari = newHari;
    }

    //getter
    public String getNama() {
        return nama;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public Sopir getSopir() {
        return sopir;
    }

    public int getHari() {
        return hari;
    }

    public int hitungBiayaTotal () {
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }
}