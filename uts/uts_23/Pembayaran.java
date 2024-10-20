package uts_23;

public class Pembayaran {
    //atribut
    private Penghuni penghuniKos;
    private double bayar;
    private String tanggal;

    //konstruktor
    public Pembayaran(Penghuni penghuniKos, double bayar, String tanggal) {
        this.penghuniKos = penghuniKos;
        this.bayar = bayar;
        this.tanggal = tanggal;
    }

    //method
    public void setPenghuni(Penghuni dataPenghuni) {
        this.penghuniKos = dataPenghuni;
    }

    public Penghuni getPenghuni() {
        return penghuniKos;
    }

    public void setBayar(double inputBayar) {
        this.bayar = inputBayar;
    }

    public double getBayar() {
        return bayar;
    }

    public void setTanggal(String inputTanggal) {
        this.tanggal = inputTanggal;
    }

    public String getTanggal() {
        return tanggal;
    }

    @Override
    public String toString() {
        return "Pembayaran atas nama: " + penghuniKos.getNama() + ", Ruang Kamar: " + penghuniKos.getNoKamar() + ", Nominal bayar: " + bayar + ", Tanggal: " + tanggal;
    }
}