package Java07_OOP.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human person = new Human("Rahul", 23);

        Human twin = (Human) person.clone();

        System.out.println("Name = " + twin.name);
        System.out.println("Age = " + twin.age);
        System.out.println("Array = " + Arrays.toString(twin.arr));

        twin.arr[0] = 200;
        System.out.println(Arrays.toString(person.arr));
        System.out.println();

        DeepCopy person1 = new DeepCopy("Sam", 22);
        DeepCopy copyPerson1 = (DeepCopy) person1.clone();

        System.out.println(Arrays.toString(person1.arr));
        System.out.println(Arrays.toString(copyPerson1.arr));
        System.out.println();
        copyPerson1.arr[0] = 300;

        System.out.println(Arrays.toString(person1.arr));
        System.out.println(Arrays.toString(copyPerson1.arr));

    }
}
