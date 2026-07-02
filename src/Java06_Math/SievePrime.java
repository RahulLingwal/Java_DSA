package Java06_Math;

import java.util.Scanner;

public class SievePrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number upto which you want prime numbers = ");
        int n = input.nextInt();

        prime(n);
    }

    static void prime(int n) {
        boolean[] primes = new boolean[n + 1];

        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
