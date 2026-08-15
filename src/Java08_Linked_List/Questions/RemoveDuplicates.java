package Java08_Linked_List.Questions;

//https://leetcode.com/problems/remove-duplicates-from-sorted-list/

public class RemoveDuplicates {
    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.insert(1);
        list.insert(1);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(3);
        list.insert(4);
        list.display();

        ListNode result = Solution.deleteDuplicates(list.head);
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.println("null");
    }
}

class Solution {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode cur = head;

        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }

        return head;
    }
}
