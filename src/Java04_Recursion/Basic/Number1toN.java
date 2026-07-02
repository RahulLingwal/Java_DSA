package Java04_Recursion.Basic;

public class Number1toN {
    public static void main(String[] args) {
        number(10);
    }

    static void number(int n) {
        if (n < 1) {
            return;
        }

        number(n - 1);
        System.out.println(n);
    }
}
