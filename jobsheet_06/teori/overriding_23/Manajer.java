public class Manajer {
    //atribut
    protected String nama;
    protected int gaji;

    //konstruktor
    public Manajer(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    //method
    public void naikkanGaji() {
        gaji += 1000000;
    }

    public void cetakStatus() {
        System.out.println("\nNama : " + nama);
        System.out.println("Gaji : " + gaji);
    }
}