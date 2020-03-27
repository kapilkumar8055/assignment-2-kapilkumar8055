package problem2.main;

import problem1.node.TreeNode;

public class Traverse {
    public void printPostOrderTraversal(TreeNode node) {
        if (node == null)
            return;
        printPostOrderTraversal(node.getLeft());
        printPostOrderTraversal(node.getRight());
        System.out.print(node.getData() + " ");
    }

    public void printInOrderTraversal(TreeNode node) {
        if (node == null)
            return;
        printInOrderTraversal(node.getLeft());
        System.out.print(node.getData() + " ");
        printInOrderTraversal(node.getRight());
    }

    public void printPreOrderTraversal(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.getData() + " ");
        printPreOrderTraversal(node.getLeft());
        printPreOrderTraversal(node.getRight());
    }
}
