package Java04_Recursion.Recursion2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int num = input.nextInt();

        palindrome(num);
    }

    static void palindrome(int num) {
        int digits = (int) (Math.log10(num)) + 1;
        int rev = reverse(num, digits);

        if (rev == num) {
            System.out.println("Given number is palindrome.");
        } else {
            System.out.println("Given number is not palindrome");
        }
    }

    private static int reverse(int num, int digits) {
        if (num % 10 == num) return num;

        int rem = num % 10;
        int power = (int) Math.pow(10, (digits - 1));

        return rem * power + reverse(num / 10, digits - 1);
    }
}
