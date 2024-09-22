package tugas.studiKasus1;

public class EncapTest_23 {
    public static void main(String[] args) {
        //objek 1
        EncapDemo_23 encap1 = new EncapDemo_23();
        encap1.setName("James");
        encap1.setAge(35);

        System.out.println("Name : " + encap1.getName());
        System.out.println("Age  : " + encap1.getAge());

        System.out.println("----------------------\n");
        //objek 2
        EncapDemo_23 encap2 = new EncapDemo_23();
        encap2.setName("Yasmine");
        encap2.setAge(10);

        System.out.println("Name : " + encap2.getName());
        System.out.println("Age  : " + encap2.getAge());
    }
}