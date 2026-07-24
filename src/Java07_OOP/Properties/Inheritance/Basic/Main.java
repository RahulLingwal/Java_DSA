package Java07_OOP.Properties.Inheritance.Basic;

public class Main {
    public static void main(String[] args) {
        Hyundai venue = new Hyundai();
        venue.display();

        Hyundai creta = new Hyundai(4.3f, 113, 17, "Creta");
        creta.display();

        
        Car car = new Hyundai(4, 80, 19, "i20");

        // Valid: 'length' is declared in the Car class, so it is accessible
        // through a Car reference.
        System.out.println(car.length);


        // Invalid:
        // 'model' is declared only in the Hyundai class.
        // Although the actual object is Hyundai, the reference type is Car,
        // so the compiler allows access only to members declared in Car.
        // System.out.println(car.model);   // Compile-time error
    }
}
