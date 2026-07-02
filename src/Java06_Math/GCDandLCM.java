package Java06_Math;

import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number = ");
        int num1 = in.nextInt();

        System.out.print("Enter second number = ");
        int num2 = in.nextInt();

        System.out.println("GCD givne numbers = " + gcd(num1, num2));

        System.out.println("LCM givne numbers = " + lcm(num1, num2));
    }

    static int gcd(int num1, int num2) {
        if (num1 == 0) return num2;

        return gcd(num2 % num1, num1);
    }

    static int lcm(int num1, int num2) {
        return (num1 * num2) / gcd(num1, num2);
    }
}
