/**
 * Problem: Determine whether a binary search tree is balanced.
 */

class TreeNode {
    protected int value;
    protected TreeNode left, TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }
}


public class Solution1 {
    /**
     * Solution:
     * Recursively get the height of the binary tree then compare the
     * height of left subtree and right subtree. For a balanced binary tree,
     * the diff should be less than or equal to 1.
     *
     * Analysis:
     * Time Complexity: O(NlogN), where N means the number of node in the tree.
     * Space Complexity:
     */
    public static boolean isBalanced(TreeNode node) {
        if (node == null) {
            return 0;
        }

        TreeNode current = node;
        int left = 1;
        while (current != null) {
            left++;
            current = current.left;
        }

        current = node;
        int right = 1;
        while (current != null) {
            right++;
            current = current.right;
        }

        return Math.abs(left - right) < 1;
    }


    public static void main(String[] args) {

