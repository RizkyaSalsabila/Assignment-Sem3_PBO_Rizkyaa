package tugas.studiKasus1;

public class EncapDemo_23 {
    //atribut
    private String name;
    private int age;

    //method
    //getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    //setter
    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        if (newAge > 30) {
            age = 30;
        } else {
            age = newAge;
        }
    }
}