public class TreeNode {
    protected int value;
    protected TreeNode left;
    protected TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public void setLeft(TreeNode left) { this.left = left; }

    public void setRight(TreeNode right) { this.right = right; }
}
