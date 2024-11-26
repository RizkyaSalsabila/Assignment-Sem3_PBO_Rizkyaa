package percobaan1_23;

public class Tester1 {
    public static void main(String[] args) {
        //buat objek bertipe data PermanentEmployee
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);

        //buat objek bertipe data InternshipEmployee
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);

        //buat objek bertipe data ElectricityBill
        ElectricityBill eBill = new ElectricityBill(5, "A-1");

        Employee e;
        Payable p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;

        System.out.println("-- Terkait class PermanentEmployee --");
        System.out.println("> --------------------------");
        System.out.println(pEmp.getEmployeeInfo());
        System.out.println("Jumlah Pendapatan : " + pEmp.getPaymentAmount());

        System.out.println("\n-- Terkait class InternshipEmployee --");
        System.out.println("> --------------------------");
        System.out.println(iEmp.getEmployeeInfo());

        System.out.println("-- Terkait class ElectricityBill --");
        System.out.println("> --------------------------");
        System.out.println(eBill.getBillInfo());
    }
}