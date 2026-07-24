package Java07_OOP.Properties.Inheritance.Basic;

public class Hyundai extends Car {
    String model;

    public Hyundai() {
        this.model = "Venue";
    }

    public Hyundai(float length, int power, int mileage, String model) {
        super(length, power, mileage);

        this.model = model;
    }

    public void display() {
        System.out.println("Model = " + this.model);
        System.out.println("Length = " + this.length + " meters");
        System.out.println("Power = " + this.power + " HP");
        System.out.println("Mileage = " + this.mileage + " kmpl\n");
    }
}
