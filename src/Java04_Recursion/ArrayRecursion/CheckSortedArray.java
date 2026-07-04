package Java04_Recursion.ArrayRecursion;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 9, 10, 11};

        if (isSorted1(arr, 0)) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted.");
        }
    }

    static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }

        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    }

    static boolean isSorted1(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }

        if (arr[index] > arr[index + 1]) {
            return false;
        }

        return isSorted1(arr, index + 1);
    }
}
