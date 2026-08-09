package Java08_Linked_List;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }

        if (index == size) {
            insertLast(value);
            return;
        }

        if (index < 0 || index > size) {
            System.out.println("Incorrect index entered!");
            return;
        }

        Node prev = head;
        for (int i = 1; i < index; i++) {
            prev = prev.next;
        }

        Node node = new Node(value, prev.next);
        prev.next = node;

        size++;
    }

    public int deleteFirst() {
        if (head == null) {
            System.out.println("List is Empty!");
            return -1;
        }

        int val = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
        return val;
    }

    public int deleteLast() {
        if (head == null) {
            System.out.println("List is Empty!");
            return -1;
        }

        if (head == tail) {
            return deleteFirst();
        }

        Node prev = head;
        for (int i = 1; i < size - 1; i++) {
            prev = prev.next;
        }
        int val = prev.next.value;
        prev.next = null;
        tail = prev;
        size--;

        return val;
    }

    public int delete(int index) {
        if (head == null) {
            System.out.println("List is Empty!");
            return -1;
        }

        if (index < 0 || index >= size) {
            System.out.println("Incorrect index entered!");
            return -1;
        }

        if (index == 0) return deleteFirst();

        if (index == size - 1) return deleteLast();

        Node prev = head;
        for (int i = 1; i < index; i++) {
            prev = prev.next;
        }

        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;

        return val;
    }

    public int findIndex(int value) {
        Node temp = head;

        for (int i = 0; temp != null; i++) {
            if (temp.value == value) {
                return i;
            }
            temp = temp.next;
        }

        return -1;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
