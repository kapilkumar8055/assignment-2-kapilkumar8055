package problem1.mybst;

import problem1.node.TreeNode;

import java.util.Queue;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    static Queue<TreeNode> queue;

    public void inordertraversal(TreeNode root) {
        if (root.getLeft() != null) {
            inordertraversal(root.getLeft());
            System.out.println(root.getData());
            inordertraversal(root.getRight());
        }
    }

    public TreeNode insert(TreeNode root, int d) {
        if (root == null)
            return new TreeNode(d);
    }
}
