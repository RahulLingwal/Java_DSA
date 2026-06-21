package Java01_Java_Basics.Conditional_Statements;

import java.util.Scanner;

public class SwitchEnhanced {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter car model to now its brand name = ");
        String model = input.next();

        switch (model) {
            case "Creta" -> System.out.println("Hyundai");
            case "Sierra" -> System.out.println("Tata");
            case "Seltos" -> System.out.println("Kia");
            case "Kodiaq" -> System.out.println("Skoda");
            default -> System.out.println("Don't have info or invalid model name.");
        }
    }
}
