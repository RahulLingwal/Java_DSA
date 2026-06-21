package Java01_Java_Basics.Array;

public class Array_Initialization {
    public static void main(String[] args) {

        // Method 1
        int[] arr = {1, 2, 45, 6, 7};

        System.out.println("Value at index 2 = " + arr[2]);
        System.out.println();

        // Method 2: Can be used both during declaration and later assignment
        int[] arr2 = new int[]{2, 3, 45, 6, 7};

        System.out.println("Value at index 3 = " + arr2[3]);
        System.out.println();

        int[] arr3;
        arr3 = new int[]{3, 6, 8, 9, 10};

        System.out.print("Array = ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
