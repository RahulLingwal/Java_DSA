package Java07_OOP.WildCard;

import java.util.ArrayList;
import java.util.List;

public class LowerBounded {
    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        addnumbers(numbers);

        System.out.println(numbers);
    }

    public static void addnumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Object value = list.get(0);
        System.out.println("First number = " + value);
    }
}
