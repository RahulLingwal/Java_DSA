package Java07_OOP.Properties.Abstraction;

public abstract class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void start();

    abstract void headLight();

}
