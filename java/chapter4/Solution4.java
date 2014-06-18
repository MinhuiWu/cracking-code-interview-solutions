import java.util.*;

/**
 * Problem: Given a binary tree, design an algorithm which creates a linked
 * list of all the nodes at each depth.
 */

public class Solution4 {
    /**
     * Solution:
     * Same like level order traverse, instead of recursively traverse each
     * level, use a queue to store visited nodes.
     *
     * Analysis:
     * Time Complexity: O(N), where N means the number of nodes in the tree
     * Space Complexity: O(N), where N means the number of nodes in the tree
     */
    public static ArrayList<Integer> flattenBST(TreeNode root) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> nodes = new LinkedList<TreeNode>();
        ArrayList<Integer> results = new ArrayList<Integer>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            TreeNode node = nodes.poll();
            results.add(node.value);
            if (node.left != null) nodes.add(node.left);
            if (node.right != null) nodes.add(node.right);
        }

        return results;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        TreeNode root = TreeUtil.buildBST(array);
        System.out.println(root.value);

        ArrayList<Integer> result = flattenBST(root);
        for (Integer a : result) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
