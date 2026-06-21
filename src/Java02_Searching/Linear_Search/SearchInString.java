package Java02_Searching.Linear_Search;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Rahul";
        char target = 'u';

        System.out.println(Arrays.toString(name.toCharArray()));

        if (search(name, target)) {
            System.out.println("Character is present in String.");
        } else {
            System.out.println("Character is not present in String.");
        }
    }

    static boolean search(String name, char target) {
        if (name.isEmpty()) return false;

        for (char ch : name.toCharArray()) {
            if (target == ch) {
                return true;
            }
        }
        return false;
    }
}
