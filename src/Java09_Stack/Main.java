package Java09_Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        stackImplementation();
        System.out.println("\n---------Dynamic Stack ---------");
        dynamicStack();
    }

    private static void stackImplementation() throws Exception {
        CustomStack stack = new CustomStack(5);

        for (int i = 0; i < 5; i++) {
            stack.push(i + 1);
        }

        System.out.println(stack);
        System.out.println("\nSize of stack = " + stack.size());

        System.out.println("\nPeek of stack = " + stack.peek());
        System.out.println("\nElement removed from stack = " + stack.pop());
        System.out.println("\nSize of stack = " + stack.size());
    }

    private static void dynamicStack() throws Exception {
        DynamicStack stack = new DynamicStack(5);

        for (int i = 0; i < 15; i++) {
            stack.push(i + 1);
        }

        System.out.println(stack);
        System.out.println("\nSize of stack = " + stack.size());

        System.out.println("\nPeek of stack = " + stack.peek());
        System.out.println("\nElement removed from stack = " + stack.pop());
        System.out.println("\nSize of stack = " + stack.size());
    }
}
