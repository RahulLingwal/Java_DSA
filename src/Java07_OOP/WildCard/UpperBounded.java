package Java07_OOP.WildCard;

import java.util.List;

public class UpperBounded {
    public static void main(String[] args) {
        List<Integer> num = List.of(1, 2, 3, 4);
        printSum(num);

        List<Float> decimal = List.of(1.5f, 2.5f, 5.5f, 6.5f);
        printSum(decimal);
    }

    public static void printSum(List<? extends Number> list) {
        double total = 0;

        for (Number num : list) {
            total += num.doubleValue();
        }

        System.out.println("Sum = " + total + "\n");
    }
}
