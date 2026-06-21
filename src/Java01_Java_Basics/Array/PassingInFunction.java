package Java01_Java_Basics.Array;

import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arr) + "\n");

        changeArray(arr);
        
        System.out.print("Array after modify by function = ");
        System.out.println(Arrays.toString(arr));
    }

    static void changeArray(int[] arr) {
        arr[1] = 2222;
    }
}
