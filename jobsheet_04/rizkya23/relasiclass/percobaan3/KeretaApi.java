public class KeretaApi {
    //atribut
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;

    //konstruktor 3 parameter
    public KeretaApi(String nama, String kelas, Pegawai masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    //konstruktor 4 parameter
    public KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    //method
    //setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setMasinis(Pegawai masinis) {
        this.masinis = masinis;
    }

    public void setNama(Pegawai asisten) {
        this.asisten = asisten;
    }


    //getter
    public String getNama() {
        return nama;
    }

    public String info() {
        String info = "";
        info += "Nama : " + this.nama + "\n";
        info += "Kelas : " + this.kelas + "\n";
        info += "Masinis : " + this.masinis.info() + "\n";
        if (this.asisten != null) {
            info += "Asisten : " + asisten.info() + "\n";
        } else {
            info += "Asisten : Tidak ada";
        }
        return info;
    }
}