public class buku {
    //atribut
    private String judul, penerbit;
    private int jumlah, halaman;
    private double harga;

    //method setJudul()
    public void setJudul(String dataBaru) {
        judul = dataBaru;
    }

    //method setPenerbit()
    public void setPenerbit(String dataBaru) {
        penerbit = dataBaru;
    }

    //method setHalaman()
    public void setHalaman(int dataBaru) {
        halaman = dataBaru;
    }

    //method setJumlah()
    public void setJumlah(int dataBaru) {
        jumlah = dataBaru;
    }

    //method setHarga()
    public void setHarga(double dataBaru) {
        harga = dataBaru;
    }

    //method cetakInformasiBuku()
    public void cetakInformasiBuku() {
        System.out.println("Judul     : " + judul);
        System.out.println("Penerbit  : " + penerbit);
        System.out.println("Halaman   : " + halaman);
        System.out.println("Jumlah    : " + jumlah);
        System.out.println("Harga     : " + harga);
    }
}