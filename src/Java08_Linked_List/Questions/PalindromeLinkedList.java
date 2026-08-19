package Java08_Linked_List.Questions;

// https://leetcode.com/problems/palindrome-linked-list/

public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.insert(1);
        list.insert(2);
        list.insert(2);
        list.insert(1);
        list.display();

        if (isPalindrome(list.head)) {
            System.out.println("Given Linked list is palindrome.");
        } else {
            System.out.println("Give Linked list is not palindrome.");
        }
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode mid = middleList(head);
        ListNode reverseHead = reverseList(mid);
        ListNode reReverseHead = reverseHead;

        while (head != null && reverseHead != null) {
            if (head.val != reverseHead.val) {
                break;
            } else {
                head = head.next;
                reverseHead = reverseHead.next;
            }
        }

        reverseList(reReverseHead);

        return head == null || reverseHead == null;
    }

    private static ListNode middleList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

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
