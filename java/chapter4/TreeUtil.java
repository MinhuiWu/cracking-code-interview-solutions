public class TreeUtil {
    /**
     * Build a binary search tree based on a sorted array.
     */
    public static TreeNode buildBST(int[] array) {
        return buildBSTHelper(array, 0, array.length - 1);
    }

    private static TreeNode buildBSTHelper(int[] array, int low, int high) {
        if (low > high) {
            return null;
        }

        int mid = (low + high) / 2;
        int midVal = array[mid];

        TreeNode root = new TreeNode(midVal);
        root.left = buildBSTHelper(array, low, mid - 1);
        root.right = buildBSTHelper(array, mid + 1, high);

        return root;
    }
}
