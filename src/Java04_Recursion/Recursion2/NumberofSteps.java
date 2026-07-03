package Java04_Recursion.Recursion2;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero

import java.util.Scanner;

public class NumberofSteps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number  = ");
        int num = input.nextInt();

        int ans = numberOfSteps(num);
        System.out.println("Number of steps taken to reduce number to zero = " + ans);
    }

    public static int numberOfSteps(int num) {
        return reduce(num, 0);
    }

    private static int reduce(int num, int steps) {
        if (num == 0) return steps;

        if (num % 2 == 0) {
            return reduce(num / 2, ++steps);
        } else {
            return reduce(num - 1, ++steps);
        }
    }
}
