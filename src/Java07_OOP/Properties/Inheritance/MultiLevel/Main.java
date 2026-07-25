package Java07_OOP.Properties.Inheritance.MultiLevel;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        System.out.println(manager.name);

        Manager manager1 = new Manager("Sam", 20, 102, 20000, 10, "Marketing");
        System.out.println(manager1.name);
    }
}
