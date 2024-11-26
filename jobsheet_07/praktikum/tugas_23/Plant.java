package tugas_23;

public class Plant {
    public void doDestroy(Destroyable d) {
        if (d instanceof Zombie) {
            ((Zombie) d).destroyed();
        } else if (d instanceof Barrier) {
            ((Barrier) d).destroyed();
        }
    }
}