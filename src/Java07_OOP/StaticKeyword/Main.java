package Java07_OOP.StaticKeyword;

public class Main {
    public static void main(String[] args) {
        Tester obj = new Tester();
        Tester.action();
    }
}

class Tester {
    int id;
    String name;

    Tester() {
        this.id = 101;
        this.name = "Rahul";
    }

    static void action() {
        Tester obj = new Tester();
        obj.display();
    }

    void display() {
        System.out.println(this.id);
        System.out.println(this.name);
    }
}
