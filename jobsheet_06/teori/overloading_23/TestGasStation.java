package overloading_23;

public class TestGasStation {
    public static void main(String[] args) {
       //buat objek bertipe MobilMewah
        MobilMewah alphard = new MobilMewah();

        //buat objek bertipe MobilKuno
        MobilKuno carry = new MobilKuno();

        //buat objek bertipe GasStation
        GasStation gs = new GasStation();

        //panggil dan cetak
        gs.isiBahanBakar(carry, 20000);
        gs.isiBahanBakar(alphard, 20000); 
    }
}