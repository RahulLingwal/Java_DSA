package Java10_Queue;

public class CircularQueue {
    private static final int DEFAULT_SIZE = 10;
    private int[] queue;
    private int front = 0;
    private int end = 0;
    private int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.queue = new int[size];
    }

    private boolean isFull() {
        return size == queue.length;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }

        queue[end++] = value;
        end = end % queue.length;
        size++;
    }

    public int dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot delete from empty queue!");
        }

        int removed = queue[front++];
        front = front % queue.length;
        size--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty!");
        }

        return queue[front];
    }

    public int size() {
        return size;
    }

    public void display() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty!");
        }

        int i = front;

        do {
            System.out.print(queue[i] + " <- ");
            i++;
            i = i % queue.length;
        } while (i != end);

        System.out.println("end");
    }
}
