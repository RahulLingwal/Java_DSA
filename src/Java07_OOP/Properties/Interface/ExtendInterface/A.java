package Java07_OOP.Properties.Interface.ExtendInterface;

public interface A {
    void greet();

    default void print() {
        System.out.println("This is default method.");
    }
}
