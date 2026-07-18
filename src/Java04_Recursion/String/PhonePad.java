package Java04_Recursion.String;

import java.util.ArrayList;
import java.util.List;

public class PhonePad {
    public static void main(String[] args) {
        phonePad("", "12");

        List<String> ans = phonePadList("", "12");
        System.out.println(ans);
    }

    static void phonePad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        int start = (digit - 1) * 3;
        int end = digit * 3;

        if (digit == 9) {
            end = start + 2;
        }

        for (int i = start; i < end; i++) {
            char ch = (char) ('a' + i);
            phonePad(p + ch, up.substring(1));
        }
    }

    static List<String> phonePadList(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        int start = (digit - 1) * 3;
        int end = digit * 3;

        if (digit == 9) {
            end = start + 2;
        }

        List<String> list = new ArrayList<>();

        for (int i = start; i < end; i++) {
            char ch = (char) ('a' + i);
            list.addAll(phonePadList(p + ch, up.substring(1)));
        }
        return list;
    }
}
