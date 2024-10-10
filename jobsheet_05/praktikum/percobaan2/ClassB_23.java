package percobaan2;

public class ClassB_23 extends ClassA_23 {
    //atribut
    private int z;

    //method
    public void setZ(int z) {
        this.z = z;
    }

    public void getNilaiZ() {
        System.out.println("Nilai Z : " + z);
    }

    public void getJumlah() {
        System.out.println("Jumlah : " + (x+y+z));
    }
}