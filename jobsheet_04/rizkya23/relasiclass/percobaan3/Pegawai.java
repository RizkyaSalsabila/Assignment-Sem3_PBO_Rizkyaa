public class Pegawai {
    //atribut
    private String nip;
    private String nama;

    //konstruktor berparameter
    public Pegawai(String NIP, String nm) {
        nip = NIP;
        nama = nm;
    }

    //method
    //setter
    public void setNip(String newNip) {
        nip = newNip;
    }

    public void setNama(String newNama) {
        nama = newNama;
    }

    //getter
    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String info() {
        String info = "";
        info += "NIP : " + nip + "\n";
        info += "Nama : " + nama + "\n";
        return info;
    }
}