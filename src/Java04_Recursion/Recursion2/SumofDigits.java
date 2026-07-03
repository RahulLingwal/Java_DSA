package Java04_Recursion.Recursion2;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int num = input.nextInt();

        int ans = digitSum(num);
        System.out.printf("Sum of n digits = %d", ans);

        System.out.println();
        int prod = digitProduct(num);
        System.out.printf("Product of n digits = %d", prod);
    }

    static int digitSum(int num) {
        if (num % 10 == 0) return num;

        return (num % 10) + digitSum(num / 10);
    }

    static int digitProduct(int num) {
        if (num % 10 == num) return num;

        return (num % 10) * digitProduct(num / 10);
    }

}
