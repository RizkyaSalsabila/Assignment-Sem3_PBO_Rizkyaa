package praktikum.tugas.Lingkaran;

public class HitungLingkaran_23 {
    //atribut
    public Double phi, r;

    public HitungLingkaran_23(Double jariJari) {
        phi = 3.14;
        r = jariJari;
    }

    //method
    public double hitungLuas() {
        return phi * r * r;
    }

    public double hitungKeliling() {
        return 2 * phi * r;
    }
}