package Java01_Java_Basics.Functions;

public class Scope {
    public static void main(String[] args) {
        int a = 100;
        int c;

        {
            System.out.println("Inside block scope = " + a);
            a = 200;
            int b = 500;
            c = 700;
        }

        System.out.println("Outside block scope after value updated inside block = " + a + "\n");

//      System.out.println("Trying to access variable initialize inside block = " + b);  give error

        System.out.println("Accessing variable declare outside block and initialize inside block = " + c);

    }
}
