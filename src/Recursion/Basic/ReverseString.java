package Recursion.Basic;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] string = {'h', 'e', 'l', 'l', 'o' };

        reverseString(string, 0, string.length - 1);
        System.out.println(Arrays.toString(string));
    }

    static void reverseString(char[] s, int start, int end) {
        if (start > end) return;

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        reverseString(s, start + 1, end - 1);
    }

}
