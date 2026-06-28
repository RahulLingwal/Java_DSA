package Java01_Java_Basics.Patterns;

public class Pattern2 {
    public static void main(String[] args) {
        pattern11(5);
    }

    static void pattern11(int n) {

        for (int row = 1; row < n; row++) {
            // Print leading spaces
            for (int j = 1; j <= n - row; j++) {
                System.out.print("  ");
            }

            // Print stars and spaces
            for (int j = 1; j <= (2 * row - 1); j++) {
                if (j == 1 || j == (2 * row - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        // Print base
        for (int i = 1; i <= (2 * n - 1); i++) {
            System.out.print("*");
        }
    }
}
