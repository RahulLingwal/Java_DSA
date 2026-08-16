package Java08_Linked_List.Questions;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num = sc.nextInt();

        if (isHappy(num)) {
            System.out.printf("%d is a Happy number.", num);
        } else {
            System.out.printf("%d is not a Happy number.", num);
        }
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (fast != slow);

        if (slow == 1) {
            return true;
        }

        return false;
    }

    private static int findSquare(int n) {
        int ans = 0;

        while (n > 0) {
            int rem = n % 10;
            ans += rem * rem;
            n /= 10;
        }
        return ans;
    }
}
