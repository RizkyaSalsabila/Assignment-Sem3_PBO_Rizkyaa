public class Lingkaran_23 extends BangunDatar_23 {
    //atribut
    public float r;

    //konstruktor
    public Lingkaran_23(float jariJari) {
        r = jariJari;
    }

    //method
    @Override
    public float luas() {
        return (float) (Math.PI * r * r);
    }

    @Override
    public float keliling() {
        return (float) (2 * Math.PI * r);
    }
}