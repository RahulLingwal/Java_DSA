package Java08_Linked_List;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        for (int i = 5; i > 0; i--) {
            list.insertFirst(i);
        }
        System.out.println("\nLinked list after element inserted from beginning");
        list.display();

        System.out.println("\nLinked list after element inserted from last");
        list.insertLast(6);
        list.display();

        System.out.println("\nLinked list after element inserted at given index");
        list.insert(10, 5);
        list.display();

        System.out.println("\nElement deleted = " + list.deleteFirst() + "\n");
        System.out.println("Linked list after element deleted from first index");
        list.display();

        System.out.println("\nElement deleted = " + list.deleteLast() + "\n");
        System.out.println("Linked list after element deleted from last index");
        list.display();

        System.out.println("\nElement deleted = " + list.delete(3) + "\n");
        System.out.println("Linked list after element deleted from given index");
        list.display();

        System.out.println("\nElement found at index = " + list.findIndex(4));
    }
}
