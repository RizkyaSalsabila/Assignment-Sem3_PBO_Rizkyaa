package tugas;

public class MainTugas_23 {
    public static void main(String[] args) {
        //objek dosen
        //dosen 1
        Dosen_23 d1 = new Dosen_23("13579", "Bella", "Sukorejo");
        d1.setSKS(10);
        d1.setTarifSKS(80000);

        //dosen 2
        Dosen_23 d2 = new Dosen_23("12345", "Sabila", "Pandaan");
        d2.setSKS(6);
        d2.setTarifSKS(50000);

        //dosen 3
        Dosen_23 d3 = new Dosen_23("24680", "Rizkya", "Malang");
        d3.setSKS(8);
        d3.setTarifSKS(65000);

        
        //Hitung gaji setiap dosen
        int gajiDosen1 = d1.getSKS() * d1.getTarifSKS();
        int gajiDosen2 = d2.getSKS() * d2.getTarifSKS();
        int gajiDosen3 = d3.getSKS() * d3.getTarifSKS();

        //Cetak gaji setiap dosen
        System.out.println("--- Gaji Keseluruhan Dosen ---");
        System.out.println(d1.getNama() + " : Rp" + gajiDosen1);
        System.out.println(d2.getNama() + " : Rp" + gajiDosen2);
        System.out.println(d3.getNama() + " : Rp" + gajiDosen3);

        DaftarGaji_23 listGaji = new DaftarGaji_23(5);
        listGaji.addPegawai(d1);
        listGaji.addPegawai(d2);
        listGaji.addPegawai(d3);

        System.out.println("\n\n--- Info Detail Pegawai 'Dosen' ---");
        for(int i = 0; i < listGaji.listPegawai.length; i++) {
            if (listGaji.listPegawai[i] != null) {
                System.out.println("-- Pegawai ke " + (i+1) + "--");
                System.out.println("Nama   : " + listGaji.listPegawai[i].getNama());
                System.out.println("Nip    : " + listGaji.listPegawai[i].getNIP());
                System.out.println("Alamat : " + listGaji.listPegawai[i].getAlamat() + "\n");
            }
        }
    }
}
