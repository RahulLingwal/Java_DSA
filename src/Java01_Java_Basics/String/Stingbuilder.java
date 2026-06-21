package Java01_Java_Basics.String;

public class Stingbuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            str.append(ch).append(" ");
        }

        System.out.println(str);
        System.out.println();

        System.out.println(str.reverse());

    }
}
