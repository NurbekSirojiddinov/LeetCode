package leetcode.tree;

public class SumOfLeftLeaves {
    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root);

        return sum;
    }

    public void dfs(TreeNode root) {
        if (root == null) return;

        if (root.left != null && root.left.left == null && root.left.right == null)
            sum += root.left.val;

        dfs(root.left);
        dfs(root.right);
    }

    public static void main(String[] args) {
        SumOfLeftLeaves sumOfLeftLeaves = new SumOfLeftLeaves();
        System.out.println(sumOfLeftLeaves.sumOfLeftLeaves(new TreeNode()));
    }
}
