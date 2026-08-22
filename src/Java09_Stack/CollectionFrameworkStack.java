package Java09_Stack;

import java.util.Stack;

public class CollectionFrameworkStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);
        System.out.println("\nSize of stack = " + stack.size());

        int popped = stack.pop();
        System.out.println("Element removed from top = " + popped);
        System.out.println("Stack after pop = " + stack);

        System.out.println("Topmost Element = " + stack.peek());
        System.out.println("Position form topmost element = " + stack.search(20));

    }
}
