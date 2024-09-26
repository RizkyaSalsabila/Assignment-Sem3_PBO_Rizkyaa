public class Processor {
    //atribut
    private String merk;
    private double cache;

    //konstruktor default
    public Processor() {

    }

    //konstruktor berparameter
    public Processor(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    //method
    //setter
    public void setMerk(String newMerk) {
        merk = newMerk;
    }

    public void setCache(double newCache) {
        cache = newCache;
    }

    //getter
    public String getMerk() {
        return merk;
    }

    public double getCache() {
        return cache;
    }

    public void info() {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
}