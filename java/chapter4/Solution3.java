/**
 * Problem: Given a sorted array, write an algorithm to create a binary search
 * tree with minimal height.
 */


public class Solution3 {
    /**
     * Solution:
     * To create a minimal height tree, we need to map nodes to the left and
     * right subtrees as more as possile. For a sorted in ascending order array,
     * we should choose the middle element recursively to build a binary search tree.
     *
     * Analysis:
     * Time Complexity:
     * Space Complexity:
     */
    public static TreeNode createBST(int[] array) {
        return createBSTHelper(array, 0, array.length - 1);
    }

    private static TreeNode createBSTHelper(int[] array, int low, int high) {
        if (low > high) {
            return null;
        }

        int mid = (low + high) / 2;
        int midVal = array[mid];
        TreeNode node = new TreeNode(midVal);
        node.left = createBSTHelper(array, low, mid - 1);
        node.right = createBSTHelper(array, mid + 1, high);

        return node;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        TreeNode root = createBST(array);
        System.out.println(root.value);
    }
}
