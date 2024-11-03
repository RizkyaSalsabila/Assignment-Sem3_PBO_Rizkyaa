package tugas_23;

public class Segitiga {
    //atribut
    private int sudut;
    private int keliling;
    private double c;

    //method
    public int totalSudut(int sudutA) {
        return sudut = 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return sudut = 180 - (sudutA + sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return keliling = sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        return c = Math.sqrt(sisiA + sisiB);
    }

    public static void main(String[] args) {
        //pembuatan objek
        Segitiga sgt = new Segitiga();

        //pemanggilan objek
        System.out.println("Total sudut (1 parameter) : " + sgt.totalSudut(90));
        System.out.println("Total sudut (2 parameter) : " + sgt.totalSudut(45, 15));
        System.out.println("Total keliling (2 parameter- int) : " + sgt.keliling(5, 6, 8));
        System.out.println("Total keliling (2 parameter- double) : " + sgt.keliling(3, 4));        
    }
}