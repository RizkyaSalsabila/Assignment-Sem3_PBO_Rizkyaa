public class Penumpang {
    //atribut
    private String ktp;
    private String nama;

    //konstruktor berparameter
    public Penumpang(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }

    //method
    //setter
    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    //getter
    public String getKtp() {
        return ktp;
    }

    public String getNama() {
        return nama;
    }

    public String info() {
        String info = "";
        info += "KTP : " + ktp + "\n";
        info += "Nama : " + nama + "\n";
        return info;
    }
}