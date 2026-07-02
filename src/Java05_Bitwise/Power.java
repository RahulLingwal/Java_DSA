package Java05_Bitwise;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number = ");
        int num = input.nextInt();

        System.out.print("Enter power = ");
        int power = input.nextInt();

        int ans = pow(num, power);
        System.out.printf("%d ^ %d = %d", num, power, ans);
    }

    static int pow(int num, int power) {
        int ans = 1;

        while (power > 0) {
            if ((power & 1) == 1) {
                ans = ans * num;
            }

            num *= num;
            power = power >> 1;
        }

        return ans;
    }
}
