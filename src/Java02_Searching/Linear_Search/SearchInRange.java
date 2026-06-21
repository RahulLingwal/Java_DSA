package Java02_Searching.Linear_Search;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 11, 12};
        int start = 2;
        int end = 5;
        int target = 12;

        int result = search(arr, start, end, target);
        if (result != -1) {
            System.out.println("Element found at index = " + result);
        } else {
            System.out.println("Element not found.");
        }

    }

    static int search(int[] arr, int start, int end, int target) {
        if (arr.length == 0) return -1;

        for (int i = start; i <= end; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
}
