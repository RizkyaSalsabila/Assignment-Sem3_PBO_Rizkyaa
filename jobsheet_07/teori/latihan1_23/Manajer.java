public class Manajer extends Pegawai {
    //atribut
    private int tunjangan;

    //konstruktor
    public Manajer(String nama, int gaji, int tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    //method
    public int getGaji() {
        return gaji;
    }

    public int getTunjangan() {
        return tunjangan;
    }
}