package praktikum.tugas.VideoGame;

public class PeminjamanGame_23 {
    //atribut
    public int id_peminjaman, harga, qty, lama_sewa;
    public String nama_peminjam, alamat, telp_peminjam, nama_game, tgl_pinjam, tgl_kembali;

    //konstruktor
    public PeminjamanGame_23(int idp, String nm_peminjam, String alm, String t_peminjam, String nm_game, 
    int q, int hrg, String t_pinjam, String t_kembali) {
        id_peminjaman = idp;
        nama_peminjam = nm_peminjam;
        alamat = alm;
        telp_peminjam = t_peminjam;
        nama_game = nm_game;
        qty = q;
        harga = hrg;
        tgl_pinjam = t_pinjam;
        tgl_kembali = t_kembali;
    }

    //method
    public void tampilDataPeminjaman() {
        System.out.println("> INFO UTAMA");
        System.out.println("ID          : " + id_peminjaman);
        System.out.println("Nama        : " + nama_peminjam);
        System.out.println("Alamat      : " + alamat);
        System.out.println("Nomer HP    : " + telp_peminjam);
        System.out.println("\n> INFO LAIN");
        System.out.println("Nama Game        : " + nama_game);
        System.out.println("Jumlah Game      : " + qty);
        System.out.println("Harga            : " + harga);
        System.out.println("Tanggal Pinjam   : " + tgl_pinjam);
        System.out.println("Tanggal Kembali  : " + tgl_kembali);
    }

    public int hitungLamaPinjam(String tl_pinjam, String tl_kembali) {
        String tgl_pinjamGame = tgl_pinjam.substring(0, 2);
        int tgl1 = Integer.parseInt(tgl_pinjamGame);
        String tgl_kembaliGame = tgl_kembali.substring(0, 2);
        int tgl2 = Integer.parseInt(tgl_kembaliGame);

        lama_sewa = tgl2 - tgl1;
        System.out.println("Lama pinjam game : " + lama_sewa + " hari");
        return lama_sewa;
    }

    public int totalHarga() {
        int total_harga = harga * qty * lama_sewa;
        System.out.println("Total Harga Peminjaman : " + total_harga);
        return total_harga;
    }
}
