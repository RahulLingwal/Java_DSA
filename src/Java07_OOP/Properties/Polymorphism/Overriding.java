package Java07_OOP.Properties.Polymorphism;

// Run Time or Dynamic Polymorphism

public class Overriding {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();

        Circle circle = new Circle();
        circle.draw();

        /* Method overriding uses runtime polymorphism.
          The reference type (Shape) is checked at compile time to ensure the method exists,
          but the actual method that executes is determined at runtime based on the object type.
          Here, although the reference is of type Shape, it points to a Circle object,
          so Circle's overridden draw() method is called.*/

        Shape shapeCircle = new Circle();
        shapeCircle.draw();

        // Reference type decides which methods are accessible.
        // Object type decides which overridden method is executed.
    }
}

class Shape {
    void draw() {
        System.out.println("Draw a shape.\n");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Draw a circle.\n");
    }
}
