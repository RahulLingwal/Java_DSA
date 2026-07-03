package Java04_Recursion.Recursion2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int num = input.nextInt();

        int ans = factorial(num);
        System.out.printf("Factorial of given number = %d", ans);
    }

    static int factorial(int num) {
        if (num == 0) return 1;

        return num * factorial(num - 1);
    }
}
