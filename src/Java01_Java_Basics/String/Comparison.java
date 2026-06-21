package Java01_Java_Basics.String;

public class Comparison {
    public static void main(String[] args) {
        String a = "Rahul";
        String b = "Rahul";
        System.out.println(a == b);   //true :a and b pointing to same object in String Pool in Heap

        String str1 = new String("Rahul");
        String str2 = new String("Rahul");
        System.out.println(str1 == str2);   // false: here str1 and str1 create different instances.
    }
}
