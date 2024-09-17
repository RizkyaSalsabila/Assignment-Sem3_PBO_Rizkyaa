public class SepedaDemo {
    public static void main(String[] args) {
        //dua buah objek sepeda
        Sepeda spd1 = new SepedaGunung();
        Sepeda spd2 = new SepedaGunung();

        //panggil method di dalam objek sepeda
        System.out.println("--- Sepeda 1 ---");
        spd1.setMerek("Polygone");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.cetakStatus();

        System.out.println("\n--- Sepeda 2 ---");
        spd2.setMerek("Wiim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.cetakStatus();

        //PERCOBAAN 2
        SepedaGunung spd3 = new SepedaGunung();
        System.out.println("\n--- Sepeda 3 ---");
        spd3.setMerek("Klinee");
        spd3.tambahKecepatan(5);
        spd3.gantiGear(7);
        spd3.setTipeSuspensi("Gas Suspension");
        spd3.cetakStatus();

    }
}