package Java07_OOP.Basics;

public class SharedReference {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = emp1;

        emp2.salary = 10000;
        System.out.println(emp1.salary);
    }
}

class Employee {
    int id;
    String name;
    String job;
    float salary;

    Employee() {
        id = 101;
        name = "Sam";
        job = "Web Developer";
        salary = 500000;
    }
}
