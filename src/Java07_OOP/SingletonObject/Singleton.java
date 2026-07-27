package Java07_OOP.SingletonObject;

public class Singleton {
    // Step 1: Create a private static object
    private static Singleton instance = new Singleton();

    // Step 2: Make the constructor private
    private Singleton() {
        System.out.println("Singleton object created");
    }

    // Step 3: Provide a public method to access the object
    public static Singleton getInstance() {
        return instance;
    }
}
