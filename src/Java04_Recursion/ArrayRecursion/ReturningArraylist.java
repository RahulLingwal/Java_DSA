package Java04_Recursion.ArrayRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReturningArraylist {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 6, 8, 10, 11, 3};
        System.out.println("Array = " + Arrays.toString(arr));

        Scanner input = new Scanner(System.in);
        System.out.print("Enter target = ");
        int target = input.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = find(arr, target, 0, list);

        if (!ans.isEmpty()) {
            System.out.println("Element found at index = " + ans);
        } else {
            System.out.println("Element not found.");
        }
    }

    static ArrayList<Integer> find(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) return list;

        if (arr[index] == target) {
            list.add(index);
        }

        return find(arr, target, index + 1, list);
    }
}
