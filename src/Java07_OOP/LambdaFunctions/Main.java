package Java07_OOP.LambdaFunctions;

interface Square {
    int findSquare(int num);
}

interface PrintName {
    void print(String name);
}

public class Main {
    public static void main(String[] args) {
        PrintName display = (name) -> System.out.println("Name = " + name);
        display.print("Rahul");


        Square s = (num) -> {
            System.out.print("Square of given number = ");
            return num * num;
        };

        System.out.println(s.findSquare(5));
    }
}
