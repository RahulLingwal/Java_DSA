package Java07_OOP.Access_Modifiers.Pack1;

public class Child extends Parent {
    void display() {
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(this.c);
//        System.out.println(this.d); //private member can't be accessed

    }
}
