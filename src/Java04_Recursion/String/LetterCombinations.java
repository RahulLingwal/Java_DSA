package Java04_Recursion.String;

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    public static void main(String[] args) {
        List<String> ans = letterCombinations("79");
        System.out.println(ans);
    }

    static List<String> letterCombinations(String digits) {
        return combination("", digits);
    }

    private static List<String> combination(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';

        List<String> list = new ArrayList<>();

        if (digit == 7) {
            for (int i = (digit - 2) * 3; i <= (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                list.addAll(combination(p + ch, up.substring(1)));
            }
        } else if (digit == 8) {
            for (int i = (digit - 2) * 3 + 1; i <= (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                list.addAll(combination(p + ch, up.substring(1)));
            }
        } else if (digit == 9) {
            for (int i = (digit - 2) * 3 + 1; i <= (digit - 1) * 3 + 1; i++) {
                char ch = (char) ('a' + i);
                list.addAll(combination(p + ch, up.substring(1)));
            }
        } else {
            for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                list.addAll(combination(p + ch, up.substring(1)));
            }
        }

        return list;
    }
}
