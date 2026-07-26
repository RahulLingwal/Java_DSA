package Java07_OOP.Access_Modifiers.Pack2;

import Java07_OOP.Access_Modifiers.Pack1.Parent;

public class AnotherMain {
    public static void main(String[] args) {
        AnotherPackage obj = new AnotherPackage();
        obj.print();

        Parent parentObj = new Parent();
        System.out.println(parentObj.a);
//        System.out.println(parentObj.b); // protected member can't be accessed
//        System.out.println(parentObj.c); // member having default access can't be accessed in another package
//        System.out.println(parentObj.d);  //private member can't be accessed in another package
    }
}
