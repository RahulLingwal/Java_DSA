package Java08_Linked_List.Questions;

// https://leetcode.com/problems/linked-list-cycle/

public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.insert(1);
        list.insert(3);
        list.insert(5);
        list.insert(2);
        list.insert(-4, list.head.next);
        System.out.println(CycleSolution.hasCycle(list.head));
    }
}

class CycleSolution {
    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }
}
