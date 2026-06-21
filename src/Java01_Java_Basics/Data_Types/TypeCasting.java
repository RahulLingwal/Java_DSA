package Java01_Java_Basics.Data_Types;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // type casting
        int num = (int) (67.56f);
        System.out.println(num);
        System.out.println();

        int a = 257;
        byte b = (byte) (a);    // 257 % 256 = 1
        System.out.println(b);
        System.out.println();

        // automatic type promotion in expressions
        byte c = 40;
        byte d = 50;
        byte e = 100;
        int f = c * d / e;
        System.out.println(f);
        System.out.println();

        int number = 'A';
        System.out.println("A = " + number);
        System.out.println();

        // In Java, arithmetic operations on byte, short, and char are automatically promoted to int.
        //  num1 * 1   becomes an int expression, even though num1 is a byte thats why type caste to (btye).
        byte num1 = 20;
        num1 = (byte) (num1 * 1);
        System.out.println(num1);
        System.out.println();

        // Rule to Remember
        // Small → Large → Automatic casting
        // Large → Small → Explicit casting required

        /*
           Automatic Type Casting
           byte → short → int → long → float → double
       */
    }
}
