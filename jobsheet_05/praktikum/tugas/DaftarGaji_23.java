package tugas;

public class DaftarGaji_23 {
    //atribut
    Pegawai_23[] listPegawai;
    int index;

    //konstruktor
    public DaftarGaji_23(int data) {
        listPegawai = new Pegawai_23[data];
        index = 0;
    }

    public void addPegawai(Pegawai_23 pegawai) {
        if (index < listPegawai.length) {
            listPegawai[index] = pegawai;
            index++;
        } else {
            System.out.println("Data sudah full...");
            System.out.println("Anda tidak dapat menambah data baru");
        }
    }
}