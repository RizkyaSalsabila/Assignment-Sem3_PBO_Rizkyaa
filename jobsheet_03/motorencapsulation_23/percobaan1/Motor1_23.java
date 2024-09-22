public class Motor1_23 {
    //atribut
    public int kecepatan = 0;
    public boolean kontakOn = false;

    //method
    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak ON");
        } else {
            System.out.println("Kontak OFF");
        }

        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}