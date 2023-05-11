package leetcode.tree;

public class MinimumDistanceBetweenBSTNodes {
    int minDiff;
    int lastVal;

    public int minDiffInBST(TreeNode root) {
        lastVal = Integer.MAX_VALUE;
        minDiff = Integer.MAX_VALUE;
        inorder(root);
        return minDiff == Integer.MAX_VALUE ? -1 : minDiff;
    }

    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        if (lastVal != Integer.MAX_VALUE) {
            minDiff = Math.min(minDiff, root.val - lastVal);
        }
        lastVal = root.val;
        inorder(root.right);
    }

    public static void main(String[] args) {
        MinimumDistanceBetweenBSTNodes minimumDistanceBetweenBSTNodes = new MinimumDistanceBetweenBSTNodes();
        System.out.println(minimumDistanceBetweenBSTNodes.minDiffInBST(new TreeNode()));
    }
}
