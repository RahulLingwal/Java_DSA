package Java08_Linked_List;

public class CircularLinkedList {
    private int size;
    private Node head;
    private Node tail;

    public CircularLinkedList() {
        this.size = 0;
    }

    public void insert(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
            tail = node;
            node.next = head;
            size++;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;

        size++;
    }

    public int delete(int index) {
        if (head == null) {
            System.out.println("List is empty cannot delete.");
            return -1;
        }

        if (index < 0 || index >= size) {
            System.out.println("Invalid index.");
            return -1;
        }

        if (index == 0) {
            if (head == tail) {
                int deleted = head.data;
                head = null;
                tail = null;
                size--;
                return deleted;
            } else {
                int deleted = head.data;
                head = head.next;
                tail.next = head;
                size--;
                return deleted;
            }
        }

        if (index == size - 1) {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            int deleted = temp.next.data;
            temp.next = head;
            tail = temp;
            size--;

            return deleted;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        int deleted = temp.next.data;
        temp.next = temp.next.next;
        size--;

        return deleted;
    }

    public void display() {
        Node temp = head;

        if (head != null) {
            do {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.println("HEAD");
        }
    }

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
