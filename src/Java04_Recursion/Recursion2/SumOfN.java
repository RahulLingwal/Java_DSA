package Java04_Recursion.Recursion2;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number upto which you want sum = ");
        int n = input.nextInt();

        int ans = sum(n);
        System.out.printf("Sum = %d", ans);
    }

    static int sum(int n) {
        if (n == 0) return 0;

        return n + sum(n - 1);
    }
}
