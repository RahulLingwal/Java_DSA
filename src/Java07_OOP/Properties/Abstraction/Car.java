package Java07_OOP.Properties.Abstraction;

public class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println("Engine start using push start button.");
    }

    @Override
    public void headLight() {
        System.out.println("Turn on headlight.");
    }

}
