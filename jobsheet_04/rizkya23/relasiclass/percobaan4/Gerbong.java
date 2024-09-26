public class Gerbong {
    //atribut
    private String kode;
    private Kursi[] arrayKursi;

    //konstruktor
    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    //method
    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi [i] = new Kursi(String.valueOf(i + 1));
        }
    }

    public String info() {
        String info = "";
        info += "Kode : " + kode + "\n";
        for(Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {
       //tambahan nomer 5 
       if (this.arrayKursi[nomor - 1].getPenumpang() != null) {
        System.out.println("Kursi nomor " + nomor + " sudah ditempati.");
       } else {
        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
        System.out.println("Penumpang " + penumpang.info() + " berhasil ditempatkan di kursi nomor " + nomor);
       }
    }
}