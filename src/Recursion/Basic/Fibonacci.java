package Recursion.Basic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter to get fibonacci number  = ");
        int n = input.nextInt();

        int ans = fibnacci(n);
        System.out.println(n + "th fibonacci number = " + ans);
    }

    static int fibnacci(int n) {
        if (n < 2) {
            return n;
        }

        return fibnacci(n - 1) + fibnacci(n - 2);
    }
}
