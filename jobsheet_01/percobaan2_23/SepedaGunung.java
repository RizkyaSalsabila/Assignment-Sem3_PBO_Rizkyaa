public class SepedaGunung extends Sepeda {
    //atribut
    private String tipeSuspensi;

    //method setTipeSuspensi()
    public void setTipeSuspensi(String newValue) {
        tipeSuspensi = newValue;
    }

    //method cetakStatus() untuk menambahkan info tipe suspensi
    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Tipe Suspensi : " + tipeSuspensi);
    }
}