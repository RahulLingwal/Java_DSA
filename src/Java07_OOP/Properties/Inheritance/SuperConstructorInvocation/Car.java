package Java07_OOP.Properties.Inheritance.SuperConstructorInvocation;

public class Car {
    float length;
    int power;
    int mileage;
    String model;

    public Car() {
//        super();  // Object class
        this.length = 4;
        this.power = 80;
        this.mileage = 20;
        this.model = "Punch";
    }

    public Car(float length, int power, int mileage) {
        this.length = length;
        this.power = power;
        this.mileage = mileage;
    }

    public Car(Car tataCopy) {
        this.length = tataCopy.length;
        this.power = tataCopy.power;
        this.mileage = tataCopy.mileage;
    }
}
