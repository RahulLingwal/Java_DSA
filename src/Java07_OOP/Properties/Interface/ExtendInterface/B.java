package Java07_OOP.Properties.Interface.ExtendInterface;

public interface B extends A {
    static void display() {
        System.out.println("This static method in interface B.");
    }

    void fun();
}
