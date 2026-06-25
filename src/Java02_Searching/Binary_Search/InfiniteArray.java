package Java02_Searching.Binary_Search;

import java.util.Scanner;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 8, 9, 11, 13, 14, 15, 16};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Target = ");
        int target = input.nextInt();

        int ans = searchInInfiniteArray(arr, target);
        if (ans != -1) {
            System.out.println("Element found at index = " + ans);
        } else {
            System.out.println("Element not found!");
        }
    }

    static int searchInInfiniteArray(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) return mid;
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
