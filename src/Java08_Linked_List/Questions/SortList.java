package Java08_Linked_List.Questions;

// https://leetcode.com/problems/sort-list/

public class SortList {
    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.insert(4);
        list.insert(2);
        list.insert(1);
        list.insert(3);

        ListNode sortedList = SortSolution.sortList(list.head);
        ListNode temp = sortedList;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergeHead = new ListNode();
        ListNode tail = mergeHead;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }

        tail.next = (list1 != null) ? list1 : list2;
        return mergeHead.next;
    }
}

class SortSolution {
    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = SortList.middleNode(head);

        // Find the node before mid
        ListNode temp = head;
        while (temp.next != mid) {
            temp = temp.next;
        }

        // Break the connection
        temp.next = null;

        // Recursively sort both halves
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return SortList.mergeTwoLists(left, right);
    }
}
