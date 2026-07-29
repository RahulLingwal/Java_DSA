package Java07_OOP.Properties.Interface;

public class Car implements Engine, Brake, Media {
    @Override
    public void brake() {
        System.out.println("Stop the car.");
    }

    @Override
    public void start() {
        System.out.println("Start the car.");
    }

    @Override
    public void stop() {
        System.out.println("Stop the engine.");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate the car.");
    }
}
