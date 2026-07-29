package Java07_OOP.Properties.Interface;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Start motor.");
    }

    @Override
    public void stop() {
        System.out.println("Stop motor");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate electric car.");
    }
}
