package Java08_Linked_List.RecursiveLinkedList;

public class LinkedListRecursion {
    private Node head;
    private Node tail;
    private int size;

    public LinkedListRecursion() {
        this.size = 0;
    }

    public void insert(int index, int value) {
        if (index >= 0 && index <= size) {
            head = insertRecursive(index, value, head);
        } else {
            System.out.println("Invalid index entered!");
            return;
        }
    }

    private Node insertRecursive(int index, int value, Node cur) {
        if (index == 0) {
            Node node = new Node(value, cur);
            size++;
            return node;
        }

        cur.next = insertRecursive(index - 1, value, cur.next);
        return cur;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
