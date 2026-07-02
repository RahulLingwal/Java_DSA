package Java05_Bitwise;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check for even or odd = ");
        int num = input.nextInt();
        
        if ((num & 1) == 1) {
            System.out.println("Odd number.");
        } else {
            System.out.println("Even number.");
        }
    }
}
