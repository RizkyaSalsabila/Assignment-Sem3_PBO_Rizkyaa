public class MainPercobaan1 {
    public static void main(String[] args) {
        //objek processor
        Processor p = new Processor("Intel i5", 3);

        //objek laptop
        Laptop L = new Laptop("Thinkpad", p);
        L.info();

        Processor p1 = new Processor();
        p1.setMerk("Intel i5");
        p1.setCache(4);
        Laptop L1 = new Laptop();
        L1.setMerk("Thinkpad");
        L1.setProc(p1);
        L1.info();
    }
}