public class Persegi_23 {
    //atribut
    private int sisi;

    //konstruktor
    public Persegi_23(int ss) {
        sisi = ss;
    }

    //method 
    public void dataPersegi() {
        System.out.println("Panjang sisi persegi : " + sisi);
    }

    public int luasPersegi() {
        return sisi * sisi;
    }

    public int kelilingPersegi() {
        return 4 * sisi;
    }
}