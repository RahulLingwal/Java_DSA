package Java10_Queue;

public class Main {
    public static void main(String[] args) throws Exception {
//        queue();
//        circularQueue();
        dynamicQueue();
    }

    private static void queue() throws Exception {
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

    private static void circularQueue() throws Exception {
        CircularQueue queue = new CircularQueue(5);
        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i * 10);
        }
        queue.display();
        System.out.println("Size of queue = " + queue.size());

        System.out.println("\nRemoved from queue = " + queue.dequeue());
        System.out.print("Queue after dequeue = ");
        queue.display();

        System.out.println("\nHead of queue = " + queue.front());
        queue.enqueue(100);
        queue.display();

        queue.enqueue(55);
    }

    private static void dynamicQueue() throws Exception {
        CircularQueue queue = new CircularQueue(15);
        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i * 10);
        }
        queue.display();
        System.out.println("Size of queue = " + queue.size());

        System.out.println("\nRemoved from queue = " + queue.dequeue());
        System.out.print("Queue after dequeue = ");
        queue.display();

        System.out.println("\nHead of queue = " + queue.front());
        queue.enqueue(100);
        queue.display();

        queue.enqueue(200);
        queue.display();
    }
}
