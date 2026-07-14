package Java07_OOP;

public class Constructor {
    public static void main(String[] args) {
        CarEngineConst carEngine = new CarEngineConst("petrol", "V6", 2, 6, 250);

        carEngine.display();
    }
}

class CarEngineConst {
    String type;
    String layout;
    float capacity;
    int cylinders;
    int power;

    CarEngineConst(String type, String layout, float capacity, int cylinders, int power) {
        this.type = type;
        this.layout = layout;
        this.capacity = capacity;
        this.cylinders = cylinders;
        this.power = power;
    }

    void display() {
        System.out.println("Engine Type = " + this.type);
        System.out.println("Engine Layout = " + this.layout);
        System.out.println("Engine Capacity (in litres) = " + this.capacity + "l");
        System.out.println("Number of Cylinders = " + this.cylinders);
        System.out.println("Power = " + this.power + "HP");
    }
}
