package Java04_Recursion.String;

import java.util.ArrayList;
import java.util.Scanner;

public class SubsequenceGenerator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string = ");
        String input = in.next();

        subSeq("", input);

        System.out.println(subSeqReturn("", input));
    }

    static void subSeq(String proc, String unproc) {
        if (unproc.isEmpty()) {
            System.out.println(proc);
            return;
        }

        char ch = unproc.charAt(0);

        subSeq(proc + ch, unproc.substring(1));
        subSeq(proc, unproc.substring(1));

    }

    static ArrayList<String> subSeqReturn(String proc, String unproc) {
        if (unproc.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(proc);
            return list;
        }

        char ch = unproc.charAt(0);

        ArrayList<String> left = subSeqReturn(proc + ch, unproc.substring(1));
        ArrayList<String> right = subSeqReturn(proc, unproc.substring(1));

        left.addAll(right);
        return left;
    }
}
