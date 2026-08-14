package Java08_Linked_List.RecursiveLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedListRecursion list = new LinkedListRecursion();
        for (int i = 1; i <= 10; i++) {
            list.insert(i - 1, i);
        }
        list.display();
    }
}
