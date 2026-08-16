package Java08_Linked_List.Questions;

public class ListNode {
    ListNode head;
    ListNode next;
    int val;
    int pos;

    ListNode() {
        this.pos = -1;
    }

    ListNode(int val) {
        this.val = val;
        this.pos = -1;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
        this.pos = -1;
    }

    public void insert(int val) {
        ListNode node = new ListNode(val, null);
        node.pos = pos + 1;

        if (head == null) {
            head = node;
            pos++;
            return;
        }

        ListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
        pos++;
    }

    public void insert(int val, ListNode next) {
        ListNode node = new ListNode(val, next);
        node.pos = pos + 1;

        if (head == null) {
            head = node;
            pos++;
            return;
        }

        ListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
        pos++;
    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
