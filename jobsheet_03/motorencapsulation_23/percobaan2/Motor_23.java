public class Motor_23 {
    //atribut
    private int kecepatan = 0;
    private boolean kontakOn = false;

    //method
    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }


    public void tambahKecepatan() {
        if (kontakOn == true) {
            if (kecepatan + 5 <= 100) {
                kecepatan += 5;
            } else {
                System.out.println("Kecepatan telah mencapai batas maksimal, kecepatan tidak bisa ditambah lagi !!");
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin off! \n");
        }
    }

    public void kurangiKecepatan() {
        if (kontakOn == true) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin off! \n");
        }
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak ON");
        } else {
            System.out.println("Kontak OFF");
        }

        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}