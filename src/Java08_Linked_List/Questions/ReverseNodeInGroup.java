package Java08_Linked_List.Questions;

// https://leetcode.com/problems/reverse-nodes-in-k-group/

public class ReverseNodeInGroup {
    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.display();

        list.head = reverseKGroup(list.head, 3);
        list.display();

    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        int length = getLength(head);
        int count = length / k;

        ListNode cur = head;
        ListNode prev = null;
        ListNode next = head.next;

        while (count > 0) {
            ListNode last = prev;
            ListNode newEnd = cur;

            for (int i = 0; cur != null && i < k; i++) {
                cur.next = prev;
                prev = cur;
                cur = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = cur;
            prev = newEnd;

            count--;
        }
        return head;

    }

    private static int getLength(ListNode head) {
        ListNode temp = head;
        int length = 0;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        return length;
    }
}
