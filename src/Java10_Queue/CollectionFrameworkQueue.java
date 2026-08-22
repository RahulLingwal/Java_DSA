package Java10_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionFrameworkQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            queue.add(i * 10);
        }
        System.out.println(queue);

        System.out.println("Head of queue = " + queue.peek());
        System.out.println("Size of queue = " + queue.size());
        System.out.println("Remove head of queue = " + queue.remove());
        System.out.println("Remove head of queue or returns null if this queue is empty = " + queue.poll());
    }
}
