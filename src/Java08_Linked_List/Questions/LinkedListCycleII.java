package Java08_Linked_List.Questions;

// https://leetcode.com/problems/linked-list-cycle-ii/

public class LinkedListCycleII {
    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.insert(3);
        list.insert(2);
        list.insert(0);
        list.insert(-4, list.head.next);

        ListNode result = CycleIISolution.detectCycle(list.head);
        if (result != null) {
            System.out.println(result.pos);
        } else {
            System.out.println("No cycle is present.");
        }
    }
}

class CycleIISolution {
    public static ListNode detectCycle(ListNode head) {
        int length = listLength(head);

        if (length == 0) {
            return null;
        }

        ListNode first = head;
        ListNode second = head;

        while (length > 0) {
            second = second.next;
            length--;
        }

        while (first != second) {
            first = first.next;
            second = second.next;
        }

        return second;
    }

    private static int listLength(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                int length = 0;
                do {
                    slow = slow.next;
                    length++;
                } while (slow != fast);
                return length;
            }
        }

        return 0;
    }
}