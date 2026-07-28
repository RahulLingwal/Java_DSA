package Java07_OOP.Properties.Abstraction;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Hyundai");
        car1.start();

        Vehicle car2 = new Car("KIA");
        car2.headLight();

        // Vehicle car3=new Vehicle();
        // We cannot do like this.
        //The reason is that an abstract class is incomplete.
        // It can contain one or more abstract methods that have no implementation.
        // Java prevents you from creating an object of an incomplete class.
    }
}
