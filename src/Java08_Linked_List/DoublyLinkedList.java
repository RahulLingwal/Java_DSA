package Java08_Linked_List;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int size;

    public DoublyLinkedList() {
        this.size = 0;
    }

    public void insertFirst(int data) {
        Node node = new Node(data);

        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }

        head = node;
        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void display() {
        Node temp = head;

        System.out.print("Null <-> ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void reverse() {
        Node last = tail;
        System.out.print("Null <-> ");
        while (last != null) {
            System.out.print(last.data + " <-> ");
            last = last.prev;
        }
        System.out.println("null");
    }

    private class Node {
        private Node prev;
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node prev, Node next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }
}
