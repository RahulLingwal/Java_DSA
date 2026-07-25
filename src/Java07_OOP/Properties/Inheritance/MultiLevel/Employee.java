package Java07_OOP.Properties.Inheritance.MultiLevel;

public class Employee extends Person {
    int id;
    float salary;

    public Employee() {
        super();
        this.id = 101;
        this.salary = 500000;
    }

    public Employee(String name, int age, int id, float salary) {
        super(name, age);
        this.id = id;
        this.salary = salary;
    }

    void work() {
        System.out.println("Working");
    }
}
