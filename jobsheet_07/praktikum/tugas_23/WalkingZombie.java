package tugas_23;

public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health += health * 0.1;
                break;
            case 2:
                health += health * 0.3;
                break;
            case 3:
                health += health * 0.4;
                break;
            default:
                System.out.println("Unknown level!");
        }
    }

    @Override
    public void destroyed() {
        health -= health * 0.02;
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data:\n" + super.getZombieInfo();
    }
}