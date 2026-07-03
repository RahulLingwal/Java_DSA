package Java04_Recursion.Recursion2;

import java.util.Scanner;

public class CountZeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number with zeros = ");
        int num = input.nextInt();

        int ans = countZeros(num);
        System.out.println("Number of zeros = " + ans);
    }

    static int countZeros(int num) {
        return count(num, 0);
    }

    private static int count(int num, int count) {
        if (num == 0) return count;

        if (num % 10 == 0) {
            return count(num / 10, ++count);
        } else {
            return count(num / 10, count);
        }
    }
}
