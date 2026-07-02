package Java06_Math;

import java.util.Scanner;

public class NewtonsSquareRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number to find square root = ");
        int num = input.nextInt();

        double root = squareRoot(num);

        System.out.println("Square Root of " + num + " = " + root);
    }

    static double squareRoot(int num) {
        double x = num;
        double root;

        while (true) {
            root = 0.5 * (x + (num / x));

            if (Math.abs(root - x) < 0.2) {
                break;
            }
            x = root;
        }

        return root;
    }
}
