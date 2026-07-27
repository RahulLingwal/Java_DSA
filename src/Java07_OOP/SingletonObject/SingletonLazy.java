package Java07_OOP.SingletonObject;

// A lazy version creates it only when it is first needed.
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {
        System.out.println("Singleton object created");
    }

    public static SingletonLazy getInstance() {

        if (instance == null) {
            instance = new SingletonLazy();
        }

        return instance;
    }
}
