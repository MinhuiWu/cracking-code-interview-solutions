/**
 * Problem: Implement a function to check if a binary tree is a binary 
 * search tree.
 */

public class Solution5 {
    /**
     * Solution:
     * Leverage the binary search tree definition, all nodes in the left subtree
     * must be less than or equal to the current node, which must be less than
     * all nodes in the right subtree.
     * We first define two values - min and max, and recursively compare them with
     * current node.
     *
     * Analysis:
     * Time Complexity:
     * Space Complexity:
     */
    public static boolean isBST(TreeNode root) {
        return isBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isBSTHelper(TreeNode node, int min, int max) {
        if (node == null) {
            return false;
        }

        if (node.value <= min || node.value >= max) {
            return false;
        }

        if (isBSTHelper(node.left, min, node.value)
            || isBSTHelper(node.right, node.value, max)) {
            return false;
        }

        return true;
    }
}
