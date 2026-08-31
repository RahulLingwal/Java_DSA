package Java11_Trees.Binary_Search_Tree;

public class Main {
    public static void main(String[] args) {
        int[] nums = {10, 9, 7, 4, 6, 11, 12};
        BST tree = new BST();
        tree.populate(nums);
        tree.display();
        System.out.println(tree.balanced());
    }
}
