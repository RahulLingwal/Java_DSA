package Java08_Linked_List.Questions;

//https://leetcode.com/problems/remove-duplicates-from-sorted-list/

public class RemoveDuplicates {
    public static void main(String[] args) {
        Solution list = new Solution();
        list.insert(1);
        list.insert(1);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(3);
        list.insert(4);
        list.display();

        list.deleteDuplicates(list.head);
        list.display();
    }
}

class Solution {
    ListNode head;

    //------------------------ LeetCode Solution -----------------------------
    public ListNode deleteDuplicates(ListNode head) {
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
    // -------------------------------------------------------------------

    public void insert(int val) {
        ListNode node = new ListNode(val, null);
        if (head == null) {
            head = node;
            return;
        }

        ListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private class ListNode {
        private int val;
        private ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
