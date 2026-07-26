package Java07_OOP.Access_Modifiers.Pack1;

public class Main {
    public static void main(String[] args) {
        Parent obj = new Parent();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
//        System.out.println(obj.d);   // private member cannot be accessed
        System.out.println();

        Child childObj = new Child();
        childObj.display();
    }
}
