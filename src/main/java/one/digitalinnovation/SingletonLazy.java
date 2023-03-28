package one.digitalinnovation;

public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {
        // construtor privado que evita a criação de novas instâncias.
    }

    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}