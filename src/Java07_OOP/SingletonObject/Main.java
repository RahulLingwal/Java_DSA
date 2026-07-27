package Java07_OOP.SingletonObject;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        System.out.println(obj1 == obj2);
        System.out.println();

        SingletonLazy obj3 = SingletonLazy.getInstance();
        SingletonLazy obj4 = SingletonLazy.getInstance();

        System.out.println(obj3 == obj4);
    }
}
