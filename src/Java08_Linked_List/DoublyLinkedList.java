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

    public void insertLast(int data) {
        if (tail == null) {
            insertFirst(data);
            return;
        }

        Node node = new Node(data);

        tail.next = node;
        node.prev = tail;
        node.next = null;
        tail = node;

        size++;
    }

    public void insert(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println("Incorrect index entered!");
            return;
        }

        if (index == 0) {
            insertFirst(data);
            return;
        }

        if (index == size) {
            insertLast(data);
            return;
        }

        Node prevNode = head;
        for (int i = 1; i < index; i++) {
            prevNode = prevNode.next;
        }

        Node node = new Node(data, prevNode, prevNode.next);
        prevNode.next.prev = node;
        prevNode.next = node;

        size++;
    }

    public void insertAfter(int after, int data) {
        if (head == null) {
            System.out.println("List is empty cannot insert.");
            return;
        }

        if (after == size - 1) {
            insertLast(data);
            return;
        }

        if (after < 0 || after >= size) {
            System.out.println("Incorrect index entered!");
            return;
        }

        Node preNode = head;
        for (int i = 1; i <= after; i++) {
            preNode = preNode.next;
        }

        Node node = new Node(data, preNode, preNode.next);
        preNode.next.prev = node;
        preNode.next = node;

        size++;
    }

    public int deleteFirst() {
        if (head == null) {
            System.out.println("List is Empty!");
            return -1;
        }

        int deleted = head.data;

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;

        return deleted;
    }

    public int deleteLast() {
        if (head == null) {
            System.out.println("List is Empty!");
            return -1;
        }

        if (head == tail) return deleteFirst();

        int deleted = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;

        return deleted;
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

        Node remove = head;
        for (int i = 1; i <= index; i++) {
            remove = remove.next;
        }

        int deleted = remove.data;
        remove.next.prev = remove.prev;
        remove.prev.next = remove.next;
        remove.prev = null;
        remove.next = null;

        size--;

        return deleted;
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
