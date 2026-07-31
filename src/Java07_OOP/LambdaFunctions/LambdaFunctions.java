package Java07_OOP.LambdaFunctions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }
        arr.forEach((item) -> System.out.println(item));
        System.out.println();

        Consumer<Integer> fun = (item) -> System.out.println(item * 10);
        arr.forEach(fun);
        System.out.println();
    }
}
