package latihan2_23;

public class Manusia {
    //method
    public void nyalakanPerangkat(Elektronik perangkat) {
        if (perangkat instanceof TelevisiJadul) {
            System.out.println("Nyalakan televisi jadul dengan input : " + ((TelevisiJadul)perangkat).getModeInput());
            System.out.println("Voltase televisi                     : " + ((Elektronik)perangkat).getVoltase());
        } else if (perangkat instanceof TelevisiModern) {
            System.out.println("Nyalakan televisi modern dengan input : " + ((TelevisiModern)perangkat).getModeInput());
            System.out.println("Voltase televisi                      : " + ((Elektronik)perangkat).getVoltase());
        }
    }
}