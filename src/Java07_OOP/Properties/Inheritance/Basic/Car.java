package Java07_OOP.Properties.Inheritance.Basic;

public class Car {
    float length;
    int power;
    int mileage;

    public Car() {
        this.length = 4;
        this.power = 80;
        this.mileage = 20;
    }

    public Car(float length, int power, int mileage) {
        this.length = length;
        this.power = power;
        this.mileage = mileage;
    }
}
