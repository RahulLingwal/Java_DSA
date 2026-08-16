package Java08_Linked_List.Questions;

// https://leetcode.com/problems/middle-of-the-linked-list/

public class LinkedListMiddle {
    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);

        ListNode result = MiddleSolution.middleNode(list.head);
        System.out.println("Middle node = " + result.val);

        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.println("Null");
    }
}

class MiddleSolution {
    public static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
