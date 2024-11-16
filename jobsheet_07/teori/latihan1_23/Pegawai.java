public class Pegawai {
    //atribut
    protected String nama;
    protected int gaji;

    //konstruktor
    public Pegawai() {

    }

    public Pegawai(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    //method
    public int getGaji() {
        return gaji;
    }
}