package tugas_23;

public class Zombie implements Destroyable{
    //atribut
    public int health;
    public int level;

    //konstruktor
    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    //method
    public void heal() {

    }

    public void destroyed() {

    }

    public String getZombieInfo() {
        return "Health = " + health + "\nLevel = " + level;
    }
}