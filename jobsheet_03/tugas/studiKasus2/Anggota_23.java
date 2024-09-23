package tugas.studiKasus2;

public class Anggota_23 {
    //atribut
    private String nomorKTP, nama;
    private int limitPeminjaman, jumlahPeminjaman;

    //konstruktor
    public Anggota_23(String noKTP, String nm, int limitPjmn) {
        nomorKTP = noKTP;
        nama = nm;
        limitPeminjaman = limitPjmn;
        this.jumlahPeminjaman = 0;
    }

    //method
    //getter
    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPeminjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPeminjaman;
    }

    public void pinjam(int uang) {
        if ((jumlahPeminjaman + uang) > limitPeminjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPeminjaman += uang;
            System.out.println("Jumlah pinjaman saat ini : Rp" + jumlahPeminjaman);
        }
    }

    public void angsur(int uang) {
        if (uang > jumlahPeminjaman) {
             System.out.println("Periksa jumlah uang yang Anda pinjam terlebih dahulu !");
        } else {
            if (uang >= 0.1 * jumlahPeminjaman) {
                jumlahPeminjaman -= uang;
                System.out.println("Jumlah pinjaman saat ini : Rp" + jumlahPeminjaman);
            } else {
                System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
            }   
        }
    }
}