public class SepedaDemo {
    public static void main(String[] args) {
        //dua buah objek sepeda
        Sepeda spd1 = new Sepeda();
        Sepeda spd2 = new Sepeda();

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
    }
}