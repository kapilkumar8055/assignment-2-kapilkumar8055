package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();
        TreeNode root = new TreeNode(20);
        myBinarySearchTree.insert(root, 15);
        myBinarySearchTree.insert(root, 10);
        myBinarySearchTree.insert(root, 12);
        myBinarySearchTree.insert(root, 17);
        myBinarySearchTree.insert(root, 25);
        myBinarySearchTree.insert(root, 30);
        myBinarySearchTree.insert(root, 5);
        myBinarySearchTree.insert(root, 35);
        myBinarySearchTree.insert(root, 32);
    }
}
