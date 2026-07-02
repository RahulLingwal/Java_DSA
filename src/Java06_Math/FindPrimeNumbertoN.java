package Java06_Math;

import java.util.Scanner;

public class FindPrimeNumbertoN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number upto which you want prime numbers = ");
        int n = input.nextInt();

        System.out.println("Prime numbers upto " + n);
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;

        int check = 2;

        while (check * check <= num) {
            if (num % check == 0) {
                return false;
            } else {
                check++;
            }
        }

        return true;
    }
}
