public class kipasAnginLangit extends kipasAngin {
    //atribut 
    private boolean remoteControl;

    //method
    public void setRemoteControl(boolean dataBaru) {
        remoteControl = dataBaru;
    } 

    //method khusus
    public void gunakanRemoteControl() {
        if (remoteControl) {
            System.out.println("Remote control digunakan untuk mengatur kipas angin langit-langit.");
        } else {
            System.out.println("Kipas angin langit-langit ini tidak dilengkapi dengan remote control.");
        }
    }

    public void cetakInformasiKipas() {
        super.cetakInformasiKipas();
        System.out.println("Dilengkapi Remote Control ? " + (remoteControl ? "Ya" : "Tidak"));
    }
}