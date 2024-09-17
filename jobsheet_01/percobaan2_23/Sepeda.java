public class Sepeda {
    //atribut sepeda
    private String merek;
    private int kecepatan, gear;

    //method setMerek()
    public void setMerek(String newValue) {
        merek = newValue;
    }

     //method gantiGear()
    public void gantiGear(int newValue) {
        gear = newValue;
    }

     //method tambahKecepatan()
    public void tambahKecepatan(int increment) {
        kecepatan = kecepatan + increment;
    }

     //method rem()
    public void rem(int decrement) {
        kecepatan = kecepatan - decrement;
    }

     //method cetakStatus() untuk menampilkan info keseluruhan
    public void cetakStatus() {
        System.out.println("Merek         : " + merek);
        System.out.println("Kecepatan     : " + kecepatan);
        System.out.println("Gear          : " + gear);
    }
}