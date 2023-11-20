package crackit.singleton;

public class Singleton {
    private static Singleton singletonInstance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(singletonInstance == null) {
            synchronized (Singleton.class) {
                singletonInstance = new Singleton();
            }
        }
        return singletonInstance;
    }
}
