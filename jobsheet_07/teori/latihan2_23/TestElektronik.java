package latihan2_23;

public class TestElektronik {
    public static void main(String[] args) {
        //buat objek bertipe Manusia
        Manusia indro = new Manusia();

        //buat objek bertipe Manusia
        TelevisiJadul tvjadul = new TelevisiJadul("DUI", 220);

        //buat objek bertipe Manusia
        TelevisiModern tvmodern = new TelevisiModern("HDMI", 220);

        indro.nyalakanPerangkat(tvjadul);
        System.out.println("");
        indro.nyalakanPerangkat(tvmodern);
    }
}