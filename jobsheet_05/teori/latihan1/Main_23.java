public class Main_23 {
    public static void main(String[] args) {
        //objek
        PersegiPanjang_23 pp = new PersegiPanjang_23(5, 4);
        Segitiga_23 sgt = new Segitiga_23(3, 4);
        Lingkaran_23 lkrn = new Lingkaran_23(7);

        System.out.println("---------------------------");
        System.out.println("---   PERSEGI PANJANG   ---");
        System.out.println("> Luas      : " + pp.luas());
        System.out.println("> Keliling  : " + pp.keliling());
        System.out.println(" ");
        System.out.println("---      SEGITIGA       ---");
        System.out.println("> Luas      : " + sgt.luas());
        System.out.println("> Keliling  : " + sgt.keliling());
        System.out.println(" ");
        System.out.println("---     LINGKARAN      ---");
        System.out.println("> Luas      : " + lkrn.luas());
        System.out.println("> Keliling  : " + lkrn.keliling());
        System.out.println("");
        System.out.println("---------------------------");
    }
}