public class kipasAngin {
    //atribut
    private String merk;
    private double harga;
    private int kecepatan;
    private boolean hidup;

    public void setMerk(String mrk) {
        merk = mrk;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setJumlahKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void setMati(boolean hidup) {
        this.hidup = hidup;
    }

    public void nyalakan() {
        hidup = true;
        System.out.println("Kipas Angin " + merk + " dinyalakan.");
    }

    public void matikan() {
        hidup = false;
        System.out.println("Kipas Angin " + merk + " dimatikan.");
    }

    public void cetakInformasiKipas() {
        System.out.println("Merk             : " + merk);
        System.out.println("Harga            : " + harga);
        System.out.println("Jumlah Kecepatan : " + kecepatan);
        System.out.println("Status           : " + (hidup ? "Hidup" : "Mati"));
    }
}