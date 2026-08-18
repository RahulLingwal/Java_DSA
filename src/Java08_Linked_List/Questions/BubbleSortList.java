package Java08_Linked_List.Questions;

public class BubbleSortList {
    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.insert(50);
        list.insert(30);
        list.insert(10);
        list.insert(20);
        list.insert(40);
        list.display();

        list.head = bubbleSortList(4, 0, list.head);
        list.display();
    }

    private static ListNode bubbleSortList(int row, int col, ListNode head) {
        if (row == 0) {
            return head;
        }

        if (col < row) {
            ListNode first = get(col, head);
            ListNode second = get(col + 1, head);

            if (first.val > second.val) {
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second.next == null) {
                    ListNode prev = get(col - 1, head);
                    prev.next = second;
                    second.next = first;
                    first.next = null;
                } else {
                    ListNode prev = get(col - 1, head);
                    first.next = second.next;
                    prev.next = second;
                    second.next = first;
                }
            }
            return bubbleSortList(row, col + 1, head);
        } else {
            return bubbleSortList(row - 1, 0, head);
        }
    }

    private static ListNode get(int index, ListNode head) {
        ListNode temp = head;

        for (int i = 1; i <= index; i++) {
            temp = temp.next;
        }

        return temp;
    }
}
