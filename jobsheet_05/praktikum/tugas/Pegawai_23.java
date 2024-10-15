package tugas;

public class Pegawai_23 {
    //atribut
    private String nip;
    private String nama;
    private String alamat;   

    //konstruktor
    public Pegawai_23(String n, String nm, String a) {
        nip = n;
        nama = nm;
        alamat = a;
    }

    //method
    public String getNama() {
        return nama;
    }

    public String getNIP() {
        return nip;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getGaji() {
        return 0;
    }
}