package Java08_Linked_List;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 5; i > 0; i--) {
            list.insertFirst(i);
        }
        list.display();
    }
}
