public class Programmer extends Pegawai{
    //atribut
    private int bonus;

    //konstruktor
    public Programmer(String nama, int gaji, int bonus) {
        super(nama, gaji);
        this.bonus = bonus;
    }

    //method
    public int getGaji() {
        return gaji;
    }

    public int getBonus() {
        return bonus;
    }
}