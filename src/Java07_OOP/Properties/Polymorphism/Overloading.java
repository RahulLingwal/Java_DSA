package Java07_OOP.Properties.Polymorphism;

// Compile Time or Static Polymorphism

public class Overloading {
    public static void main(String[] args) {
        SquareArea squareArea = new SquareArea();
        squareArea.area(5, 5);
        squareArea.area(5.5f, 5.5f);
        System.out.println();

        Sum add = new Sum();
        add.sum(5, 10);
        add.sum(5, 10, 20);
        System.out.println();

        Person boy = new Person();
        boy.info(22, "Sam");
        boy.info("Rahul", 23);
    }
}


// Type of parameters is different
class SquareArea {
    void area(int a, int b) {
        System.out.println("Area of square = " + (a * b));
    }

    void area(float a, float b) {
        System.out.println("Area of square = " + (a * b));
    }
}

// Number of parameters is different
class Sum {
    void sum(int a, int b) {
        System.out.println("Sum of two numbers = " + (a + b));
    }

    void sum(int a, int b, int c) {
        System.out.println("Sum of three numbers = " + (a + b + c));
    }
}

// Order of parameters is different (if the parameter types are different)
class Person {
    void info(int age, String name) {
        System.out.println("Age = " + age);
        System.out.println("Name = " + name);
    }

    void info(String name, int age) {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }
}