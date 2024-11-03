package latihan_23;

public class PerkalianKu_overloading {
    //method
    void perkalian(int a, int b) {
        System.out.println(a * b);
    }

    void perkalian(int a, int b, int c) {
        System.out.println(a * b * c);
    }

    public static void main(String[] args) {
        //pembuatan objek
        PerkalianKu_overloading objek = new PerkalianKu_overloading();

        //pemanggilan objek
        System.out.println("-- Perkalian pertama --");
        objek.perkalian(25, 43);
        System.out.println("\n-- Perkalian kedua --");
        objek.perkalian(34, 23, 56);
    }
}