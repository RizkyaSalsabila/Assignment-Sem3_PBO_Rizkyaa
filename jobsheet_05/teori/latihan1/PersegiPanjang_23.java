public class PersegiPanjang_23 extends BangunDatar_23{
    //atribut
    public float panjang;
    public float lebar;

    //konstruktor
    public PersegiPanjang_23(float p, float l) {
        panjang = p;
        lebar = l;
    }

    //method 
    @Override
    public float luas() {
        return panjang * lebar;
    }

    @Override
    public float keliling() {
        return 2 * (panjang + lebar);
    }
}