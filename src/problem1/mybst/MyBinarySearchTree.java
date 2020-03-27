package problem1.mybst;

import problem1.node.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    static Queue<TreeNode> queue;

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
        System.out.println("Number of Nodes without left child: " + count);
    }

    public void printLeftTree(TreeNode root) {
        if (root == null)
            return;
        queue.add(root);
        queue.add(null);
        while (queue.size() > 0) {
            TreeNode temp = queue.peek();
            if (temp != null) {
                System.out.print(temp.getData() + " ");
                while (queue.peek() != null) {
                    if (temp.getLeft() != null)
                        queue.add(temp.getLeft());
                    if (temp.getRight() != null)
                        queue.add(temp.getRight());
                    queue.remove();
                    temp = queue.peek();
                }
                queue.add(null);
            }
            queue.remove();
        }
    }
}

