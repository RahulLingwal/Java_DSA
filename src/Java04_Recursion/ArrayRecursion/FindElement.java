package Java04_Recursion.ArrayRecursion;

import java.util.Arrays;
import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 1, 9, 10, 11, 3};
        System.out.println("Array = " + Arrays.toString(arr));

        Scanner input = new Scanner(System.in);
        System.out.print("Enter target = ");
        int target = input.nextInt();

        int ans = findElement(arr, target, 0);
        if (ans != -1) {
            System.out.println("Element found at index = " + ans);
        } else {
            System.out.println("Element not found.");
        }
    }

    static int findElement(int[] arr, int target, int index) {
        if (index == arr.length) return -1;

        if (arr[index] == target) {
            return index;
        } else {
            return findElement(arr, target, index + 1);
        }
    }
}
