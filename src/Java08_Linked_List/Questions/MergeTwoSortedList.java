package Java08_Linked_List.Questions;

// https://leetcode.com/problems/merge-two-sorted-lists/

public class MergeTwoSortedList {
    public static void main(String[] args) {
        ListNode list1 = new ListNode();
        list1.insert(1);
        list1.insert(5);
        list1.insert(9);
        System.out.println("List 1 :");
        list1.display();

        ListNode list2 = new ListNode();
        list2.insert(3);
        list2.insert(4);
        list2.insert(8);
        list2.insert(10);
        System.out.println("\nList 2 : ");
        list2.display();

        ListNode mergedList = MergeSolution.mergeTwoLists(list1.head, list2.head);
        System.out.println("\nMerged List : ");
        while (mergedList != null) {
            System.out.print(mergedList.val + " -> ");
            mergedList = mergedList.next;
        }
        System.out.println("null");
    }
}

class MergeSolution {
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
