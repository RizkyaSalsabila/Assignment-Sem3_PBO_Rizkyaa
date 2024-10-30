public class Supervisor extends Manajer {
    //konstruktor
    public Supervisor(String nama, int gaji) {
        super(nama, gaji);
    }

    //method 
    public void naikkanGaji() {
        gaji += 1500000;
    }
}