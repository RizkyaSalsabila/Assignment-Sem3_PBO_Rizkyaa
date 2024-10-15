package tugas;

public class Dosen_23 extends Pegawai_23 {
    //atribut
    public int jumlahSKS;
    public int tarif_Sks;

    //konstruktor
    public Dosen_23(String n, String nm, String a) {
        super(n, nm, a);
    }

    //method
    //setter
    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    public void setTarifSKS(int tarif_Sks) {
        this.tarif_Sks = tarif_Sks;
    }

    //getter
    public int getSKS() {
        return jumlahSKS;
    }

    public int getTarifSKS() {
        return tarif_Sks;
    }
}