package Java01_Java_Basics.Functions;

public class FunctionOverloading {
    public static void main(String[] args) {
        System.out.println("Calls sum function with two arguments = " + sum(2, 3));
        System.out.println("Calls sum function with three arguments = " + sum(2, 3, 5));
        System.out.println();

        fun(9);
        fun("Rahul");
        System.out.println();

        display("Rahul", 90);
        display(48, "Rahul");
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }

    static void display(String name, int marks) {
        System.out.println(name);
        System.out.println(marks);
    }

    static void display(int rollno, String name) {
        System.out.println(rollno);
        System.out.println(name);
    }

    /* The parameter list can differ in:
         1. Number of parameters
         2.Type of parameters
         3. Order of parameters    */

}
