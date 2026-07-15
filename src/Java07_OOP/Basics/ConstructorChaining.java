package Java07_OOP.Basics;

public class ConstructorChaining {
    public static void main(String[] args) {
        Processer processer = new Processer();

        System.out.println(processer.brand);
        System.out.println(processer.model);

        processer.clockSpeed = 2.4f;
        System.out.println(processer.clockSpeed);
    }
}

class Processer {
    String brand;
    String model;
    int cores;
    float clockSpeed;

    Processer() {
        this("Qualcomm", "8 Gen 2", 8, 2.2f);
    }

    Processer(String brand, String model, int cores, float clockSpeed) {
        this.brand = brand;
        this.model = model;
        this.cores = cores;
        this.clockSpeed = clockSpeed;
    }
}
