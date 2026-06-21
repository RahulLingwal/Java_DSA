package Java01_Java_Basics.Input_Ouput;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //     Taking integer input
        System.out.print("Enter a integer = ");
        int num = input.nextInt();
        System.out.println("Integer = " + num);

        //     Taking character input
        System.out.print("Enter a character = ");
        char character = input.next().charAt(0);
        System.out.println("Character = " + character);

        //     Taking string input only before space
        System.out.print("Enter a string = ");
        String str = input.next();
        System.out.println("String = " + str);

        input.nextLine(); // consume leftover newline

        //     Taking string input
        System.out.print("Enter a name = ");
        String name = input.nextLine();
        System.out.println("String = " + name);

        //     Taking float input
        System.out.print("Enter a decimal number = ");
        float number = input.nextFloat();
        System.out.println("Floating number = " + number);
    }
}
