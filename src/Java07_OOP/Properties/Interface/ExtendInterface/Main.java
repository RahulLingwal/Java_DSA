package Java07_OOP.Properties.Interface.ExtendInterface;

public class Main implements A, B {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.greet();
        obj.fun();
    }

    @Override
    public void fun() {
        System.out.println("I am method from interface B.");
    }

    @Override
    public void greet() {
        System.out.println("Hello Java");
    }
}
