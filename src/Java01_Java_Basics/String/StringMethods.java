package Java01_Java_Basics.String;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Rahul Hello World";
        System.out.println("String = " + str + "\n");

        System.out.println(str.length());
        System.out.println();

        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println();

        System.out.println(str.toLowerCase());
        System.out.println();

        System.out.println(str.toUpperCase());
        System.out.println();

        System.out.println(str.indexOf('a'));
        System.out.println();

        System.out.println(str.charAt(3));
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string = ");
        String str2 = input.nextLine();

        System.out.println(str2.strip());
        System.out.println();

        System.out.println(Arrays.toString(str2.split(" ")));
    }
}
