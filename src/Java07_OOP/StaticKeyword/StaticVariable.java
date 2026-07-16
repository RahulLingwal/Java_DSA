package Java07_OOP.StaticKeyword;

public class StaticVariable {
    public static void main(String[] args) {
        Human person1 = new Human("Rahul", 23, 50000);
        System.out.println(Human.population);

        Human person2 = new Human("Sam", 20, 40000);
        System.out.println(Human.population);
    }
}

class Human {
    static long population;
    String name;
    int age;
    int salary;

    Human(String name, int age, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        Human.population += 1;
    }
}