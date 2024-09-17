public class MainKaryawan_23 {
    public static void main(String[] args) {
        //objek
        Karyawan_23 kwn1 = new Karyawan_23("A0001", "Rizqi", "Laki - laki", "Manager", 3500000);
        Karyawan_23 kwn2 = new Karyawan_23("B0035", "Salsabila", "Perempuan", "HRD", 3100000);

        System.out.println("-------------------------------------");
        System.out.println("===         DATA KARYAWAN         ===");
        System.out.println("-------------------------------------");
        System.out.println("> KARYAWAN 1");
        kwn1.tampilDataDiri();
        kwn1.lihatGaji();
        System.out.println("-------------------------------------\n");
        System.out.println("> KARYAWAN 2");
        kwn2.tampilDataDiri();
        kwn2.lihatGaji();
        System.out.println("-------------------------------------\n");
    }
}