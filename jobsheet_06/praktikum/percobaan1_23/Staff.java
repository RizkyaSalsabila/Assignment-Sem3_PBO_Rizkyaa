public class Staff extends Karyawan {
    //atribut
    private int lembur;
    private double gajiLembur;

    //method
    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    public int getLembur() {
        return lembur;
    }

    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }

    public void lihatInfo() {
        System.out.println("NIP           : " + this.getNip());
        System.out.println("Nama          : " + this.getNama());
        System.out.println("Golongan      : " + this.getGolongan());
        System.out.println("Jumlah Lembur : " + this.getLembur());
        System.out.println("Gaji Lembur   : " + this.getGajiLembur());
        System.out.printf("Gaji    :  %.0f\n", this.getGaji());
    }

    //OVERLOADING
    public double getGaji(int lembur, double gajiLembur) {
        return super.getGaji() + lembur * gajiLembur;
    }

    //OVERRIDING
    public double getGaji() {
        return super.getGaji() + lembur * gajiLembur;
    }
}