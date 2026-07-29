package Java07_OOP.Properties.Interface;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.start();
        car1.acc();
        car1.brake();
        car1.stop();
        System.out.println(Car.PRICE);
        System.out.println();

        Engine car2 = new Car();
        car2.start();
        car2.acc();
        car2.stop();
        //car2.brake();   // cannot access brake
        System.out.println();

        NiceCar car3 = new NiceCar();
        car3.start();
        car3.acc();
        car3.musicStart();
        System.out.println();

        NiceCar car4 = new NiceCar(new ElectricEngine());
        car4.start();
        car4.acc();
        car4.stop();
        car4.musicStart();
    }
}
