package latihan2_23;

public class TelevisiModern extends Elektronik {
    //atribut
    private String modeInput;

    //konstruktor
    public TelevisiModern(String modeInput, int voltase) {
        super(voltase);
        this.modeInput = modeInput;
    }

    public String getModeInput() {
        return modeInput;
    }
}