package Java07_OOP.LambdaFunctions;

import java.util.Scanner;

interface Operation {
    int operation(int a, int b);
}

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculate = new Calculator();

        Operation sum = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation multiply = (a, b) -> a * b;
        Operation divide = (a, b) -> a / b;

        int choice;
        do {
            System.out.println("\n------------- Calculator --------------");
            System.out.println("1. Sum");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter choice = ");
            choice = input.nextInt();

            System.out.print("\nEnter first number = ");
            int num1 = input.nextInt();

            System.out.print("Enter second number = ");
            int num2 = input.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Sum = " + calculate.operate(num1, num2, sum));
                case 2 -> System.out.println("Subtraction = " + calculate.operate(num1, num2, sub));
                case 3 -> System.out.println("Multiplication = " + calculate.operate(num1, num2, multiply));
                case 4 -> System.out.println("Division = " + calculate.operate(num1, num2, divide));
                case 5 -> System.out.println("Exited......");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }
}
