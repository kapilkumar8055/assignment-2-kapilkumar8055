package problem4.myqueue;

import problem1.node.TreeNode;

public class Node {
    private TreeNode treeNode;
    private Node next;

    public Node(int data) {
        treeNode = new TreeNode(data);
        next = null;
    }

    public Node(TreeNode treeNode1) {
        treeNode = treeNode1;
        next = null;
    }

    public TreeNode getTreeNode() {
        return treeNode;
    }

    public void setTreeNode(TreeNode treeNode) {
        this.treeNode = treeNode;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
