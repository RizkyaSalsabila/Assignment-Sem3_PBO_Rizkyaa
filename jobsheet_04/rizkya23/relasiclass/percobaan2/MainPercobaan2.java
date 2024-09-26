public class MainPercobaan2 {
    public static void main(String[] args) {
        //objek mobil
        Mobil m = new Mobil();
        m.setMerk("Avanza");
        m.setBiaya(350000);

        //objek sopir
        Sopir s = new Sopir();
        s.setNama("John Doe");
        s.setBiaya(200000);

        //objek pelanggan
        Pelanggan p = new Pelanggan();
        p.setNama("Jane Doe");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);

        //cetak biaya total keseluruhan
        System.out.println("Biaya Total " + p.hitungBiayaTotal());

        //tambahan kode nomer 6
        System.out.println(p.getMobil().getMerk());
    }
}