package Java08_Linked_List.Questions;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.display();

        list.head = reverse(list.head);
        list.display();
    }

    private static ListNode reverse(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }
        
        ListNode cur = reverse(node.next);

        node.next.next = node;
        node.next = null;

        return cur;
    }
}
