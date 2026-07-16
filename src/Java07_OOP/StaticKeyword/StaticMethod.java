package Java07_OOP.StaticKeyword;

public class StaticMethod {
    public static void main(String[] args) {
        greeting();
        StaticMethod obj = new StaticMethod();
        obj.fun();
    }

    static void greeting() {
//        message();    Calling a non-static method inside a static method: you can't use this because it requires an instance

        StaticMethod obj = new StaticMethod();
        obj.message();

    }

    void fun() {
        message();
    }

    void message() {
        System.out.println("Hello World");
    }
}
