package latihan2_23;

public class TelevisiJadul extends Elektronik {
    //atribut
    private String modeInput;

    //konstruktor
    public TelevisiJadul(String modeInput, int voltase) {
        super(voltase);
        this.modeInput = modeInput;
    }

    public String getModeInput() {
        return modeInput;
    }
}