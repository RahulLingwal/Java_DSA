package Java01_Java_Basics.Patterns;

public class Pattern1 {
    public static void main(String[] args) {
        pattern1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern7(5);
        System.out.println();
        pattern8(5);
        System.out.println();
        pattern9(5);
        System.out.println();
        pattern10(5);
    }

    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int run = row <= n ? row : 2 * n - row;
            for (int col = 1; col <= run; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            int spaces = n - row;
            for (int i = 1; i <= spaces; i++) {
                System.out.print("   ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = n; row > 0; row--) {
            int spaces = n - row;
            for (int i = 1; i <= spaces; i++) {
                System.out.print("   ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            int spaces = n - row;
            for (int i = 1; i <= spaces; i++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int row = n; row > 0; row--) {
            int spaces = n - row;
            for (int i = 1; i <= spaces; i++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        for (int row = 2 * n; row > 0; row--) {
            int run = row > n ? row - n : n - row + 1;
            int spaces = row > n ? 2 * n - row : row - 1;

            for (int i = 1; i <= spaces; i++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= run; col++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
