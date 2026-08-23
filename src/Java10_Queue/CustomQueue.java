package Java10_Queue;

public class CustomQueue {
    private static final int DEFAULT_SIZE = 10;
    private int[] queue;
    private int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.queue = new int[size];
    }

    private boolean isFull() {
        return end == queue.length - 1;
    }

    private boolean isEmpty() {
        return end == 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }

        queue[end++] = value;
    }

    public int dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot delete from empty queue");
        }

        int removed = queue[0];

        for (int i = 1; i < end; i++) {
            queue[i - 1] = queue[i];
        }
        end--;

        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty!");
        }

        return queue[0];
    }

    public int size() {
        return end;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        for (int i = 0; i < end; i++) {
            System.out.print(queue[i] + " <- ");
        }
        System.out.println("end");
    }
}
