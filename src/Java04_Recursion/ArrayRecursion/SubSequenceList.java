package Java04_Recursion.ArrayRecursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        List<List<Integer>> ans = subSequecne(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> subSequecne(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr) {
            int size = outer.size();

            for (int i = 0; i < size; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));  // Copy the sublist of outer list
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }
}
