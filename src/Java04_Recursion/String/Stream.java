package Java04_Recursion.String;

public class Stream {
    public static void main(String[] args) {
        String str = "banana";

        skip("", str);

        System.out.println("Remove 'a' from string = " + skipReturn(str));
    }

    static void skip(String processed, String remaining) {
        if (remaining.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = remaining.charAt(0);

        if (ch == 'a') {
            skip(processed, remaining.substring(1));
        } else {
            skip(processed + ch, remaining.substring(1));
        }
    }

    static String skipReturn(String remaining) {
        if (remaining.isEmpty()) {
            return "";
        }

        char ch = remaining.charAt(0);

        if (ch == 'a') {
            return skipReturn(remaining.substring(1));
        } else {
            return ch + skipReturn(remaining.substring(1));
        }
    }
}
