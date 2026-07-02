package Java05_Bitwise;

import java.util.Scanner;

public class XORofGivenRangeOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter start of range = ");
        int start = input.nextInt();

        System.out.print("Enter end of range = ");
        int end = input.nextInt();

        int xorAns = xor(end) ^ xor(start - 1);  // XOR(0 - end) ^ XOR(0 - start-1)  = XOR((start) to (end))

        System.out.println(xorAns);
    }

    static int xor(int a) {
        if (a % 4 == 0) {
            return a;
        }

        if (a % 4 == 1) {
            return 1;
        }

        if (a % 4 == 2) {
            return a + 1;
        }

        return 0;
    }
}
