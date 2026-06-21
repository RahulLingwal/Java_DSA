package Java01_Java_Basics.Array;

public class ModifyArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Before Modifying: Element at index 2 = " + arr[2]);
        System.out.println();

        arr[2] = 200;
        System.out.println("After Modifying: Element at index 2 = " + arr[2]);
    }
}
