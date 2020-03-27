package problem1.mybst;

import problem1.node.TreeNode;

import java.util.LinkedList;
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

    public TreeNode insert(TreeNode root, int data) {
        if (root == null)
            return new TreeNode(data);
        else if (data > root.getData())
            root.setRight(insert(root.getRight(), data));
        else
            root.setLeft(insert(root.getLeft(), data));
        return root;
    }

    public void countNodesWithoutLeftChild(TreeNode root) {
        if (root == null)
            return;
        Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
        queue1.add(root);
        int count = 0;
        while (queue1 != null) {
            TreeNode temp = queue1.poll();
            if (temp == null)
                break;
            if (temp.getLeft() == null)
                count++;
            if (temp.getLeft() != null)
                queue1.add(temp.getLeft());
            if (temp.getRight() != null)
                queue1.add(temp.getRight());
        }
    }
}

