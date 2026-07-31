package Java07_OOP.Generics;

public class GenericClass {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setValue(10);
        System.out.println(box.getValue());
    }
}

class Box<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
