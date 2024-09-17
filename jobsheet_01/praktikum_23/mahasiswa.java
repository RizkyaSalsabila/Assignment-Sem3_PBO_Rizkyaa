public class mahasiswa {
    //atribut
    private String nama, alamat, prodi;
    private int NIM, tahunMasuk;

    //
    public void setNama(String isiNama) {
        nama = isiNama;
    }

    public void setNIM(int isiNIM) {
        NIM = isiNIM;
    }

    public void setAlamat(String isiAlamat) {
        alamat = isiAlamat;
    }

    public void setProdi(String isiProdi) {
        prodi = isiProdi;
    }

    public void setTahunMasuk(int isiTahun) {
        tahunMasuk = isiTahun;
    }

    public int hitungLamaStudi(int tahunSekarang) {
        return tahunSekarang - tahunMasuk;
    }

    public void cetakInformasiMahasiswa() {
        System.out.println("Nama          : " + nama);
        System.out.println("NIM         : " + NIM);
        System.out.println("Alamat      : " + alamat);
        System.out.println("Prod        : " + prodi);
        System.out.println("Tahun Masuk : " + tahunMasuk);
        System.out.println("Lama Studi  : " + hitungLamaStudi(tahunMasuk));
    }
}
