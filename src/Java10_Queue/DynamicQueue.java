package Java10_Queue;

public class DynamicQueue {
    private static final int DEFAULT_SIZE = 10;
    private int[] queue;
    private int front = 0;
    private int end = 0;
    private int size = 0;

    public DynamicQueue() {
        this(DEFAULT_SIZE);
    }

    public DynamicQueue(int size) {
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
            int[] temp = new int[queue.length * 2];

            for (int i = 0; i < queue.length; i++) {
                temp[i] = queue[(front + i) % queue.length];
            }
            front = 0;
            end = queue.length;
            queue = temp;
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
