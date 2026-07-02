package Java05_Bitwise;

import java.util.Scanner;

public class CountNumberofSetBit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to count setbits = ");
        int num = input.nextInt();

        System.out.println("Number in binary = " + Integer.toBinaryString(num));

        System.out.println("Number of Set Bits = " + count(num));
    }

    static int count(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num & (num - 1);
        }

        return count;
    }
}
