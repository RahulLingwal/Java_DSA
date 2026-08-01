package Java07_OOP.Cloning;

public class Human implements Cloneable {
    String name;
    int age;
    int[] arr;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.arr = new int[]{1, 2, 3, 4, 5};
    }

    public Object clone() throws CloneNotSupportedException {
        // this shallow copying
        return super.clone();
    }
}
