package percobaan3_23;

public class Tester3 {
    public static void main(String[] args) {
        //buat objek bertipe data PermanentEmployee
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
    
        //buat objek bertipe data InternshipEmployee
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
    
        //buat objek bertipe data ElectricityBill
        ElectricityBill eBill = new ElectricityBill(5, "A-1");
    
        Employee e[] = {pEmp, iEmp};
        Payable p[] = {pEmp, eBill};
        Employee e2[] = {pEmp, iEmp, };//eBill};
     }   
}