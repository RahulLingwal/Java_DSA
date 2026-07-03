package Java04_Recursion.Recursion2;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int num = input.nextInt();

        int rev = reverse(num);
        System.out.println("Reverser number = " + rev);
    }

    static int reverse(int num) {
        int digits = (int) (Math.log10(num)) + 1;

        return reverseNumber(num, digits);
    }

    private static int reverseNumber(int num, int digits) {
        if (num % 10 == num) return num;

        int rem = num % 10;
        int pow = (int) Math.pow(10, (digits - 1));

        return rem * pow + reverseNumber(num / 10, digits - 1);
    }
}
