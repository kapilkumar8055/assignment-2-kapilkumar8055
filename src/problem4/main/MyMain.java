package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();
        MyQueue myQueue = new MyQueue();
        TreeNode root = new TreeNode(10);
        myBinarySearchTree.insert(root, 20);
        myBinarySearchTree.insert(root, 15);
        myBinarySearchTree.insert(root, 18);
        myBinarySearchTree.insert(root, 25);
        myBinarySearchTree.insert(root, 30);
        myBinarySearchTree.insert(root, 28);
        myBinarySearchTree.insert(root, 16);
        myBinarySearchTree.insert(root, 7);
        myBinarySearchTree.insert(root, 3);
        myBinarySearchTree.insert(root, 1);
    }
}
