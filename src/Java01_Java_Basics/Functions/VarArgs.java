package Java01_Java_Basics.Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        demo(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println();

        demo("rahul", "sam", "sakshi");
        System.out.println();

        multiple(1, 4, "rahul", "sam");
        System.out.println();
    }

    static void demo(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String... v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String... v) {
        System.out.println(a + b);
        System.out.println(Arrays.toString(v));
    }
}
