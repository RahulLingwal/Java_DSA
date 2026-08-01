package Java07_OOP.ExceptionHandling;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number = ");
        int a = in.nextInt();

        System.out.print("Enter second number = ");
        int b = in.nextInt();

        try {
//            int c = a / b;
            int c = divide(a, b);
            System.out.println("Division = " + c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will always execute.");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("please do not divide by zero");
        }
        return a / b;
    }
}
