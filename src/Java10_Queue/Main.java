package Java10_Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue();
        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i * 10);
        }
        queue.display();
        System.out.println("Size of queue = " + queue.size());

        System.out.println("\nRemoved from queue = " + queue.dequeue());
        System.out.print("Queue after dequeue = ");
        queue.display();

        System.out.println("\nHead of queue = " + queue.front());
    }
}
