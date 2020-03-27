package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        Traverse traverse = new Traverse();
        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();
        TreeNode treeNode = new TreeNode(20);
        myBinarySearchTree.insert(treeNode, 4);
        myBinarySearchTree.insert(treeNode, 25);
        myBinarySearchTree.insert(treeNode, 18);
        myBinarySearchTree.insert(treeNode, 15);
        myBinarySearchTree.insert(treeNode, 24);
        myBinarySearchTree.insert(treeNode, 60);
        myBinarySearchTree.insert(treeNode, 50);
        myBinarySearchTree.insert(treeNode, 80);
        myBinarySearchTree.insert(treeNode, 90);
        myBinarySearchTree.insert(treeNode, 12);
        traverse.printPreOrderTraversal(treeNode);
        System.out.println();
        traverse.printInOrderTraversal(treeNode);
        System.out.println();
        traverse.printPostOrderTraversal(treeNode);
    }
}
