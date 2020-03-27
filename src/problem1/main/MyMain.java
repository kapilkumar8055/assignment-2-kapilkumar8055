package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();
        TreeNode root = new TreeNode(20);
        myBinarySearchTree.insert(root, 10);
        myBinarySearchTree.insert(root, 2);
        myBinarySearchTree.insert(root, 30);
        myBinarySearchTree.insert(root, 18);
        myBinarySearchTree.insert(root, 14);
        myBinarySearchTree.insert(root, 24);
        myBinarySearchTree.insert(root, 60);
        myBinarySearchTree.insert(root, 50);
        myBinarySearchTree.insert(root, 80);
        myBinarySearchTree.insert(root, 90);
        myBinarySearchTree.insert(root, 12);
        myBinarySearchTree.countNodesWithoutLeftChild(root);
    }
}
