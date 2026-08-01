package Java07_OOP.Properties.Interface.NestedInterface;

public class A {
    public interface NestedInterface {
        boolean isEven(int num);
    }
}

class B implements A.NestedInterface {
    @Override
    public boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
