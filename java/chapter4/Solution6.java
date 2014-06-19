/**
 * Problem
 * Write an algorithm to find the 'next' node (in-order successor) of a given node
 * in a binary search tree
 */

class Node {
    int value;
    Node left;
    Node right;
    Node parent;

    public Node(int value, Node left, Node right, Node parent) {
        this.value = value;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }
}

public class Solution6 {
    /**
     * Solution:
     * If the right subtree is not null, the successor should be the minimal
     * left child. If the right subtree is null, the successor should be
     * the first ancestor that does not contain right child.
     *
     * Analysis:
     * Time Complexity: O(H), where H means the height of the tree.
     */
    public static TreeNode findNext(TreeNode root, TreeNode node) {
        if (node.right != null) {
            return findMin(node.right);
        } else {

        }
    }

    private static TreeNode findMin(TreeNode node) {
        TreeNode current = node;
        while (current != null) {
            current = current.left;
        }
        return current;
    }

    private static TreeNode findParent(TreeNode node) {
        TreeNode parent = node.parent;
        TreeNode current = node;
        while (parent != null && node == parent.right) {
            node = parent;
            parent = parent.parent;
        }
        return parent;
    }
}
