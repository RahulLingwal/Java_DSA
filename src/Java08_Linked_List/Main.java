package Java08_Linked_List;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Select the option-----" +
                "\n1: Singly Linked List" +
                "\n2: Doubly Linked List" +
                "\n3: Circular Linked List"
        );
        System.out.print("Enter choice = ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> singlyLinkedList();
            case 2 -> doublyLinkedList();
        }
    }

    private static void singlyLinkedList() {
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

        int index = list.findIndex(4);
        if (index != -1) {
            System.out.println("\nElement found at index = " + index);
        } else {
            System.out.println("\nElement not found !");
        }
    }

    private static void doublyLinkedList() {
        DoublyLinkedList list = new DoublyLinkedList();

        for (int i = 20; i >= 11; i--) {
            list.insertFirst(i);
        }
        System.out.println("\nDoubly Linked list after element inserted from beginning");
        list.display();
        System.out.println("\nReversed Doubly Linked list.");
        list.reverse();

        System.out.println("\nDoubly Linked list after element inserted from last");
        list.insertLast(30);
        list.insertLast(34);
        list.display();

        System.out.println("\nDoubly Linked list after element inserted at given index");
        list.insert(11, 31);
        list.display();

        System.out.println("\nDoubly Linked list after element inserted after given index");
        list.insertAfter(11, 32);
        list.insertAfter(12, 33);
        list.display();
    }
}
