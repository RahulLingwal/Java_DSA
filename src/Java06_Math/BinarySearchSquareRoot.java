package Java06_Math;

import java.util.Scanner;

public class BinarySearchSquareRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number = ");
        int num = input.nextInt();

        System.out.print("Enter precision = ");
        int precision = input.nextInt();

        double root = squareRoot(num, precision);

        System.out.printf("Square Root of %d = %3f", num, root);
    }

    static double squareRoot(int num, int precision) {
        int s = 0;
        int e = num;

        double root = 0.0;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (mid * mid == num) return mid;

            if (mid * mid > e) {
                e = mid - 1;
            } else {
                s = mid + 1;
                root = mid;
            }
        }

        double increase = 0.1;

        for (int i = 0; i < precision; i++) {
            while (root * root <= num) {
                root += increase;
            }

            root -= increase;
            increase = increase / 10;
        }

        return root;
    }
}
