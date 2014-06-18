/**
 * Problem: Determine whether a binary search tree is balanced.
 */

public class Solution1 {
    /**
     * Solution:
     * Iteractively get the height of the binary tree then compare the
     * height of left subtree and right subtree. For a balanced binary tree,
     * the diff should be less than or equal to 1.
     *
     * Analysis:
     * Time Complexity: O(N), where N means the number of elements in the tree.
     * Space Complexity: O(1)
     */
    public static boolean isBalanced(TreeNode node) {
        if (node == null) {
            return true;
        }

        TreeNode current = node;
        int left = 0;
        while (current != null) {
            left++;
            current = current.left;
        }

        int right = 0;
        current = node;
        while (current != null) {
            right++;
            current = current.right;
        }

        return Math.abs(left - right) <= 1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeUtil.buildBST(array);
        System.out.println(isBalanced(root));

        TreeNode node = new TreeNode(9, null, new TreeNode(11, null, new TreeNode(14, null, new TreeNode(17, null, null))));
        System.out.println(isBalanced(node));
    }
}
