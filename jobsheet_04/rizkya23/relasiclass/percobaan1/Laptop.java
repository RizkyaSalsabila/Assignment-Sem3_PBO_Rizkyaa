public class Laptop {
    //atribut
    private String merk;
    private Processor proc;

    //konstruktor default
    public Laptop() {

    }

    //konstruktor berparameter
    public Laptop(String merk, Processor proc) {
        this.merk = merk;
        this.proc = proc;
    }

    //method
    public void info() {
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }

    //setter
    public void setMerk(String newMerk) {
        merk = newMerk;
    }

    public void setProc(Processor newProc) {
        proc = newProc;
    }

    //getter
    public String getMerk() {
        return merk;
    }

    public Processor getProc() {
        return proc;
    }
}