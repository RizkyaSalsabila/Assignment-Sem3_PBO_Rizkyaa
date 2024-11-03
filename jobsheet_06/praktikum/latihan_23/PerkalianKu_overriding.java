package latihan_23;

public class PerkalianKu_overriding {
    //method
    void perkalian(int a, int b) {
        System.out.println(a * b);
    }

    void perkalian(double a, double b) {
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        //pembuatan objek
        PerkalianKu_overriding objek = new PerkalianKu_overriding();

        //pemanggilan objek
        System.out.println("-- Perkalian pertama --");
        objek.perkalian(25, 43);
        System.out.println("\n-- Perkalian kedua --");
        objek.perkalian(34.56, 23.7);
    }
}