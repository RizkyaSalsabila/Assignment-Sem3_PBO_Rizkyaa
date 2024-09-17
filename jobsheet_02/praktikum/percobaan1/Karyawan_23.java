public class Karyawan_23 {
    //atribut
    public String id, nama, jenisKelamin, jabatan;
    public int gaji;

    //konstruktor
    public Karyawan_23(String i, String nm, String jk, String jbtn, int gj)  {
        id = i;
        nama = nm;
        jenisKelamin = jk;
        jabatan = jbtn;
        gaji = gj;
    }

    //method
    public void tampilDataDiri() {
        System.out.println("ID                    : " + id);
        System.out.println("Nama                  : " + nama);
        System.out.println("Jenis Kelamin         : " + jenisKelamin);
        System.out.println("Jabatan               : " + jabatan);
    }

    public void lihatGaji() {
        System.out.println("Gaji yang saya terima : " + gaji);
    }
}