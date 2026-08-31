package Java11_Trees.Binary_Tree;

import java.util.Scanner;

public class BinaryTree {
    private Node root;

    public void populate(Scanner scanner) {
        System.out.print("Enter root node = ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    public void populate(Scanner scanner, Node node) {
        System.out.print("Do you want to add node to left of " + node.value + " = ");
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.print("Enter left node = ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.print("Do you want to add node to right of " + node.value + " = ");
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.print("Enter right node = ");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(this.root, "", true);
    }

    private void display(Node node, String indent, boolean isLeft) {
        if (node == null) {
            return;
        }

        System.out.println(indent + node.value);
        if (node.left != null) {
            System.out.print(indent + "├── ");
            display(node.left, indent + "│   ", true);
        }

        if (node.right != null) {
            System.out.print(indent + "└── ");
            display(node.right, indent + "    ", false);
        }
    }

    // Traversal in Tree
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder() {
        preOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        System.out.print(node.value + " ");
        preOrder(node.right);
    }

    public void postOrder() {
        preOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.print(node.value + " ");
    }

    private class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
}
