package Java07_OOP;

public class FirstObject {
    public static void main(String[] args) {
        CarEngine engine = new CarEngine();

        engine.type = "petrol";
        engine.capacity = 1.5f;
        engine.cylinders = 4;
        engine.layout = "inline";
        engine.power = 90;

        System.out.println(engine.power);
    }

}

class CarEngine {
    String type;
    String layout;
    float capacity;
    int cylinders;
    int power;
}