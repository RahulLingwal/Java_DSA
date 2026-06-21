package Java01_Java_Basics.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>(5);

        System.out.println("Enter array elements");
        for (int i = 0; i < 10; i++) {
            arr.add(input.nextInt());
        }

        System.out.println("Array List = " + arr);
        System.out.println();


        // get item at any index
        // pass index here, list[index] syntax will not work here
        System.out.println("Element at index 3 = " + arr.get(3));
        System.out.println();

        System.out.print("Array list using loop = ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println("\n");

        // Modify Array List
        arr.set(0, 100);
        System.out.println("Array after modifying it = " + arr + "\n");

        // Remove an element at given index
        System.out.println("Removed Element = " + arr.remove(1) + "\n");
        System.out.println("Array after removing an element = " + arr);
    }
}
