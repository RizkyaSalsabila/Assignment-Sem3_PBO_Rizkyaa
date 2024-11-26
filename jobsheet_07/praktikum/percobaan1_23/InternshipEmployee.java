package percobaan1_23;

public class InternshipEmployee extends Employee {
    //atribut
    private int length;

    //konstruktor
    public InternshipEmployee(String name, int length) {
        this.length = length;
        this.name = name;
    }

    //method
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo() + "\n";
        info += "Registered as internship employee for " + length + " month/s\n";
        return info;
    }
}