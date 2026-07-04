package Java04_Recursion.ArrayRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListInitializeInsideFunction {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 6, 8, 10, 11, 3, 6};
        System.out.println("Array = " + Arrays.toString(arr));

        Scanner input = new Scanner(System.in);
        System.out.print("Enter target = ");
        int target = input.nextInt();

        ArrayList<Integer> ans = find(arr, target, 0);
        if (!ans.isEmpty()) {
            System.out.println("Element found at index = " + ans);
        } else {
            System.out.println("Element not found!");
        }
    }

    static ArrayList<Integer> find(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) return list;

        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> belowCallAnswer = find(arr, target, index + 1);
        list.addAll(belowCallAnswer);

        return list;
    }
}
