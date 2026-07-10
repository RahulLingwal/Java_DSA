package Java04_Recursion.String;

import java.util.Scanner;

public class SkipWord {
    public static void main(String[] args) {
        String str = "Apple Banana Mango Potato";
        System.out.println(str);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter word you want to remove = ");
        String word = input.next();

        skipWord("", str, word);

        System.out.println(skipWordReturn(str, word));
    }

    static void skipWord(String processed, String remaining, String word) {
        if (remaining.isEmpty()) {
            System.out.println(processed);
            return;
        }

        if (remaining.startsWith(word)) {
            skipWord(processed, remaining.substring(word.length()), word);
        } else {
            skipWord(processed + remaining.charAt(0), remaining.substring(1), word);
        }
    }

    static String skipWordReturn(String remaining, String word) {
        if (remaining.isEmpty()) {
            return "";
        }

        if (remaining.startsWith(word)) {
            return skipWordReturn(remaining.substring(word.length()), word);
        } else {
            return remaining.charAt(0) + skipWordReturn(remaining.substring(1), word);
        }
    }
}
