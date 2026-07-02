package Java04_Recursion.Basic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter to get fibonacci number  = ");
        int n = input.nextInt();

        int result = fiboFormula(n);
        System.out.println(n + "th fibonacci number using formula = " + result);

        int ans = fibnacci(n);
        System.out.println(n + "th fibonacci number = " + ans);
    }

    static int fibnacci(int n) {
        if (n < 2) {
            return n;
        }

        return fibnacci(n - 1) + fibnacci(n - 2);
    }

    static int fiboFormula(int n) {
        return (int) ((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
    }
}
