package Java10_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class CollectionFrameworkDequeue {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(12);
        queue.add(13);

        queue.addFirst(11);
        queue.addFirst(10);

        queue.addLast(14);
        queue.addLast(15);

        System.out.println(queue);
        System.out.println("\nSize of queue = " + queue.size());

        System.out.println("\nHead of queue = " + queue.peek());

        System.out.println("\nQueue contains specified element = " + queue.contains(13));

        System.out.println("\nElement removed = " + queue.removeFirst());
        System.out.println("Queue after element from head is removed = " + queue);

        System.out.println("\nElement removed = " + queue.removeLast());
        System.out.println("Queue after element from last is removed = " + queue);

        System.out.println("\nElement removed = " + queue.remove());
        System.out.println("Queue after element from head is removed = " + queue);

        queue.push(100);
        System.out.println("\nPushes an element onto the stack represented by this deque = " + queue);

        System.out.println("\nRemove first element = " + queue.pop());
    }
}
