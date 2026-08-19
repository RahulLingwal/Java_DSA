package Java08_Linked_List.Questions;

// https://leetcode.com/problems/reverse-linked-list-ii/

public class ReverseLinkedListII {
    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.display();

        list.head = reverseBetween(list.head, 2, 4);
        list.display();
    }

    private static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode cur = head;
        ListNode prev = null;

        for (int i = 0; cur != null && i < left - 1; i++) {
            prev = cur;
            cur = cur.next;
        }

        ListNode prevLeft = prev;
        ListNode newEnd = cur;

        ListNode next = cur.next;
        for (int i = 0; cur != null && i < right - left + 1; i++) {
            cur.next = prev;
            prev = cur;
            cur = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (prevLeft != null) {
            prevLeft.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = cur;
        return head;
    }
}
