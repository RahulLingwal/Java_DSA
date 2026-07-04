package Java04_Recursion.ArrayRecursion;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 1, 9, 10, 11, 3};
        System.out.println("Array = " + Arrays.toString(arr));

        Scanner input = new Scanner(System.in);
        System.out.print("Enter target = ");
        int target = input.nextInt();

        if (searchIndex(arr, 0, target)) {
            System.out.println("Element is present in array.");
        } else {
            System.out.println("Element is not present in array.");
        }
    }

    static boolean searchIndex(int[] arr, int index, int target) {
        if (index == arr.length) return false;

        return arr[index] == target || searchIndex(arr, index + 1, target);
    }
}
