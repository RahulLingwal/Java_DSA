package Java09_Stack;

public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public void push(int value) {
        if (isFull()) {
            int[] temp = new int[stack.length * 2];

            System.arraycopy(stack, 0, temp, 0, stack.length);
            stack = temp;
        }

        super.push(value);
    }
}
