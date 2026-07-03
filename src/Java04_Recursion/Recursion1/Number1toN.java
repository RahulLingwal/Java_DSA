package Java04_Recursion.Recursion1;

public class Number1toN {
    public static void main(String[] args) {
        number(10);
    }

    static void number(int n) {
        if (n < 1) {
            return;
        }
        System.out.print(n + " ");       //N to 1
        System.out.println();
        number(n - 1);
        System.out.print(n + " ");
    }
}
