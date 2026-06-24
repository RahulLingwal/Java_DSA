package Java02_Searching.Binary_Search;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

import java.util.Arrays;
import java.util.Scanner;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        System.out.println("Letters = " + Arrays.toString(letters));
        Scanner input = new Scanner(System.in);

        System.out.print("Enter target letter = ");
        char target = input.next().charAt(0);

        char ans = nextGreatestLetter(letters, target);
        if (ans == letters[0]) {
            System.out.println("Letter not found.");
        } else {
            System.out.println("Smallest letter greater than target = " + ans);
        }
    }

    static char nextGreatestLetter(char[] letters, char target) {
        if (target > letters[letters.length - 1]) {
            return letters[0];
        }

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // Return 1
        if (start == letters.length) {
            return letters[0];
        }
        return letters[start];

        //    Alternate Return
        //   return letters[start % letters.length];
    }


}
