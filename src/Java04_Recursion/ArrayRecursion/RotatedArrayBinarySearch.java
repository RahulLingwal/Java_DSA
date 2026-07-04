package Java04_Recursion.ArrayRecursion;

import java.util.Arrays;
import java.util.Scanner;

public class RotatedArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};   // Here arr[start]<arr[mid]

        int[] arr2 = {8, 9, 1, 2, 3, 5, 6, 7,};     // Here arr[start]>arr[mid]
        System.out.println("Array = " + Arrays.toString(arr2));

        Scanner input = new Scanner(System.in);
        System.out.print("Enter target = ");
        int target = input.nextInt();
        int ans = search(arr2, target, 0, arr.length - 1);

        if (ans != -1) {
            System.out.println("Target found at index = " + ans);
        } else {
            System.out.println("Target not found!");
        }
    }

    static int search(int[] arr, int target, int start, int end) {
        if (start > end) return -1;

        int mid = start + (end - start) / 2;

        if (target == arr[mid]) return mid;

        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target < arr[mid]) {
                return search(arr, target, start, mid - 1);
            } else {
                return search(arr, target, mid + 1, end);
            }
        }

        if (target > arr[mid] && target <= arr[end]) {
            return search(arr, target, mid + 1, end);
        } else {
            return search(arr, target, start, mid - 1);
        }
    }
}
