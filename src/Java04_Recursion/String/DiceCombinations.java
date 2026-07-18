package Java04_Recursion.String;

import java.util.ArrayList;

public class DiceCombinations {
    public static void main(String[] args) {
        generateDiceCombinations("", 4);
        ArrayList<String> list = getDiceCombinations("", 4);
        System.out.println(list);
    }

    static void generateDiceCombinations(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            generateDiceCombinations(p + i, target - i);
        }
    }

    static ArrayList<String> getDiceCombinations(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(getDiceCombinations(p + i, target - i));
        }
        return list;
    }
}
