package Java07_OOP.Cloning;

public class DeepCopy implements Cloneable {
    String name;
    int age;
    int[] arr;

    public DeepCopy(String name, int age) {
        this.name = name;
        this.age = age;
        this.arr = new int[]{10, 20, 30, 40, 50};
    }

    public Object clone() throws CloneNotSupportedException {
        // this shallow copying
        DeepCopy copy = (DeepCopy) super.clone();

        // make deep copy
        copy.arr = new int[this.arr.length];

        for (int i = 0; i < copy.arr.length; i++) {
            copy.arr[i] = this.arr[i];
        }

        return copy;
    }
}
