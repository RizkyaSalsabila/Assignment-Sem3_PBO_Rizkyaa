public class Segitiga_23 extends BangunDatar_23 {
    //atribut
    public float alas;
    public float tinggi;

    //konstruktor
    public Segitiga_23(float a, float t) {
        alas = a;
        tinggi = t;
    }

    //method
    @Override
    public float luas() {
        return (float) (0.5 * alas * tinggi);
    }

    @Override
    public float keliling() {
        return 3 * alas;
    }
}