public class kipasAnginStand extends kipasAngin {
    //atribut
    private int tinggi; //dalam cm

    //method setTinggi()
    public void setTinggi(int dataBaru) {
        tinggi = dataBaru;
    }

    //method sesuaikanTinggi()
    public void sesuaikanTinggi(int tinggiBaru) {
        tinggi = tinggiBaru;
        System.out.println("Tinggi disesuaikan menjadi : " + tinggiBaru + " cm");
    }
    //method cetak
    public void cetakInformasiKipas() {
        super.cetakInformasiKipas();
        System.out.println("Tinggi           : " + tinggi + " cm");
    }
}