package percobaan2_23;

public class PermanentEmployee extends Employee implements Payable {
    //atribut
    private int salary;

    //konstruktor
    public PermanentEmployee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    //method
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int getPaymentAmount() {
        return (int) (salary + 0.05 * salary);
    }
    
    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo() + "\n";
        info += "Registered as permanent employee with salary " + salary + "\n";
        return info;
    }
}