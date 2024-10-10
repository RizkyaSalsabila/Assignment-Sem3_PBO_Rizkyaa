package percobaan3;

public class Tabung_23 extends Bangun_23{
    //atribut
    protected int t;

    //method
    public void setSuperPhi(double phi) {
        super.phi = phi;
    }

    public void setSuperR(int r) {
        super.r = r;
    }

    public void setT(int t) {
        this.t = t;
    }

    public void volume() {
        System.out.println("Volume Tabung adalah : " + (super.phi * super.r * super.r * this.t));
    }
}