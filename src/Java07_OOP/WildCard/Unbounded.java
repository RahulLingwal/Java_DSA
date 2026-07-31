package Java07_OOP.WildCard;

import java.util.ArrayList;
import java.util.List;

public class Unbounded {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<String> names = List.of("Rahul", "Sam", "Ram");

        List<Float> price = new ArrayList<>();
        price.add(34.5f);
        price.add(56.5f);
        price.add(90.6f);

        printList(numbers);
        printList(names);
        printList(price);
    }

    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
        System.out.println();
    }
}
