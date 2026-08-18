package Java08_Linked_List.Questions;

// https://leetcode.com/problems/reverse-linked-list/

public class InPlaceReversalList {
    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.display();

        list.head = inPlaceReversal(list.head);
        list.display();
    }

    private static ListNode inPlaceReversal(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode cur = head;
        ListNode next = head.next;

        while (cur != null) {
            cur.next = prev;
            prev = cur;
            cur = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }
}
