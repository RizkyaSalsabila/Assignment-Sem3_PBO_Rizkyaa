package overloading_23;

public class GasStation {
    //atibut
    private int hargaPertamax = 10000;
    private int hargaPertalite = 5000;
    
    //method
    public void isiBahanBakar(MobilMewah mw, int bayar) {
        int totalLiter = bayar / hargaPertamax;
        System.out.println("Mobil Mewah diisi Pertamax sebanyak " + totalLiter + " liter");
    }

    public void isiBahanBakar(MobilKuno mk, int bayar) {
        int totalLiter = bayar / hargaPertalite;
        System.out.println("Mobil Kuno diisi Pertalite sebanyak " + totalLiter + " liter");
    }
}