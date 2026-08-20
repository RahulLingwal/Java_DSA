package Java08_Linked_List.Questions;

// https://leetcode.com/problems/reorder-list/

public class ReorderList {
    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.display();

        reorderList(list.head);
        list.display();
    }

    public static void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode fhead = head;
        ListNode mid = middleList(head);
        ListNode shead = reverseList(mid);

        while (fhead != null && shead != null) {
            ListNode temp = fhead.next;
            fhead.next = shead;
            fhead = temp;

            ListNode secTemp = shead.next;
            shead.next = fhead;
            shead = secTemp;
        }

        if (fhead != null) {
            fhead.next = null;
        }
    }

    private static ListNode middleList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static ListNode reverseList(ListNode head) {
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
