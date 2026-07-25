package Java07_OOP.Properties.Inheritance.MultiLevel;

public class Person {
    String name;
    int age;

    public Person() {
        super();
        this.name = "Rahul";
        this.age = 23;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void walk() {
        System.out.println("Walking");
    }
}
