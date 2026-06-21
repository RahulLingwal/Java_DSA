package Java01_Java_Basics.Array;

import java.util.Scanner;

public class ArrayOf_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] str = new String[5];

        System.out.println("Enter 5 elements.");
        for (int i = 0; i < str.length; i++) {
            System.out.print("Enter " + (i + 1) + " element = ");
            str[i] = in.next();
        }

        System.out.print("String = ");
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
    }
}
