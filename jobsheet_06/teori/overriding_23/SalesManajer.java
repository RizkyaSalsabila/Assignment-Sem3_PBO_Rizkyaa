public class SalesManajer extends Manajer {
    //atribut
    protected String departemen;

    //konstruktor
    public SalesManajer(String nama, String departemen, int gaji) {
        super(nama, gaji);
        this.departemen = departemen;
    }

    //method
    public void cetakStatus() {
        System.out.println("\nNama       : " + nama);
        System.out.println("Departemen : " + departemen);
        System.out.println("Gaji       : " + gaji);
    }
}