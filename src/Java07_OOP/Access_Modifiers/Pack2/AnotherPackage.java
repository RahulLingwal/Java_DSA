package Java07_OOP.Access_Modifiers.Pack2;

import Java07_OOP.Access_Modifiers.Pack1.Parent;

public class AnotherPackage extends Parent {
    void print() {
        System.out.println(this.a);
        System.out.println(this.b);
//        System.out.println(this.c);  // member having default access can't be accessed in another package
//        System.out.println(this.d);  //private member can't be accessed in another package
    }
}


/*
 * Java Access Modifiers

 * private:
   - Can be accessed only within the same class.

 * default (no access modifier):
  - Can be accessed within the same package only.

 * protected:
   - Can be accessed within the same package.
   - Can also be accessed by subclasses in different packages.

 * public:
   - Can be accessed from anywhere in the application.
 */