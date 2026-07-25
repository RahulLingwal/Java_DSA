package Java07_OOP.Properties.Polymorphism;

public class FinalKeyword {
    public static void main(String[] args) {
        System.out.println("1. A final class cannot be extended (inherited).");
        System.out.println("2. A final method cannot be overridden by a subclass.");
    }
}

final class Animal {
    void display() {
        System.out.println("This is Animal Class.");
    }
}

// A final class cannot be extended (inherited).
//class Cat extends Animal {
//    void cat() {
//        System.out.println("This is cat.");
//    }
//}

class Species {
    final void display() {
        System.out.println("This is Species class.");
    }
}

class Human extends Species {
    //A final method cannot be overridden by a subclass.
//    void display() {
//        System.out.println("This is Human Species.");
//    }
}
