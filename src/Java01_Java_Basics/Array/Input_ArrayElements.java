package Java01_Java_Basics.Array;

import java.util.Scanner;

public class Input_ArrayElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 elements");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter element " + (i + 1) + " of array = ");
            arr[i] = input.nextInt();
        }

        System.out.print("Array = ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        
    }
}
