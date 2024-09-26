public class MainPercobaan4 {
    public static void main(String[] args) {
    //objek bertipe Penumpang
    Penumpang p = new Penumpang("12345", "Mr. Krab");
    
    //objek bertipe Gerbong
    Gerbong gerbong = new Gerbong("A", 10);

    //tambahan kode nomer 4
    //objek budi bertipe Penumpang
    Penumpang budi = new Penumpang("78965", "Budi");

    gerbong.setPenumpang(p, 1);
    System.out.println(gerbong.info());
    
    //contoh ingin mengubah budi di posisi nomer 1
    gerbong.setPenumpang(budi, 1);
    System.out.println(gerbong.info());
    }
}