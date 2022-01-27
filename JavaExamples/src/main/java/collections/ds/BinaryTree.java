package collections.ds;

import java.util.Collections;
import java.util.Comparator;

public class BinaryTree<T> {

    Node<T> root;

    BinaryTree() { root = null; }

    void add(T data) {
        Node node = new Node(data);
        if (root == null) { root = node; return; }
        else {
            Node temp = root;
            _add(node, temp);
        }
    }

    private boolean _add(Node newNode, Node parent) {
        if (parent.left == null) { parent.left = newNode; return true; }
        else if (parent.right == null) { parent.right = newNode; return true; }
        else {
            if (_add(newNode, parent.left)) return true;
            if(_add(newNode, parent.right)) return true;
        }
        return false;
    }

    void postOrder() { printPostorder(root); }
    void printPostorder(Node node) {
        if (node == null)
            return;

        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }

    void preOrder() { printPreorder(root); }
    void printPreorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    void inOrder() { printInorder(root); }
    void printInorder(Node node) {
        if (node == null)
            return;

        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }

    public void depth() {
        System.out.println(maxDepth(root, true));
        System.out.println(maxDepth(root, false));
    }
    public int maxDepth(Node node, boolean isMax) {

        if (node == null) return -1;

        int l = maxDepth(node.left, isMax);
        int r = maxDepth(node.right, isMax);

        if (isMax && l > r) return l+1;
        else if (!isMax && l < r) return r+1;
        else if (isMax) return r+1;
        else return l+1;

    }

}

class Node<T> {
    T key;
    Node left, right;

    public Node(T item) {
        key = item;
        left = right = null;
    }
}

class BinaryTreeExample {

    public static void main(String[] a) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        /*tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);*/

        /*  4 5 2 3 1
            1 2 4 5 3
            4 2 5 1 3
        */

        /*tree.postOrder();
        System.out.println();
        tree.preOrder();
        System.out.println();
        tree.inOrder();
        System.out.println();*/
        tree.depth();
    }

}
