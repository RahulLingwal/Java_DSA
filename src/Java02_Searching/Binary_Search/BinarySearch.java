package Java02_Searching.Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 26, 30, 40, 44, 52, 68, 77, 80, 90, 99, 100};
        int target = 80;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.printf("Element found at index = %d", result);
        } else {
            System.out.println("Element not found.");
        }

    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
