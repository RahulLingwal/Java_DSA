package Java07_OOP.Properties.Inheritance.SuperConstructorInvocation;

public class Main {
    public static void main(String[] args) {
        Tata sierra = new Tata(4.3f, 106, 16, "Sierra");
        Tata sierraCopy = new Tata(sierra);
        sierraCopy.display();

        Tata altroz = new Tata();
        altroz.display();
    }
}
