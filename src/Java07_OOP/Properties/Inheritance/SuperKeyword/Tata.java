package Java07_OOP.Properties.Inheritance.SuperKeyword;

public class Tata extends Car {
    String model;

    public Tata() {
        this.model = "Nexon";
    }

    public Tata(float length, int power, int mileage, String model) {
        super(length, power, mileage);
        this.model = model;
    }

    public Tata(Tata copy) {
        super(copy);
        this.model = copy.model;
    }

    public void display() {
        System.out.println("Model = " + this.model);
        System.out.println("Length = " + this.length + " meters");
        System.out.println("Power = " + this.power + " HP");
        System.out.println("Mileage = " + this.mileage + " kmpl\n");
    }
}
