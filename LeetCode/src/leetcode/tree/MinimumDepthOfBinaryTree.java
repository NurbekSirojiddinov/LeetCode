package leetcode.tree;

public class MinimumDepthOfBinaryTree {
    int ans = 100001;

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        dfs(root, 1);
        return ans;
    }

    public void dfs(TreeNode root, int depth) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null && depth < ans) {
            ans = depth;
        }

        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }

    public static void main(String[] args) {
        MinimumDepthOfBinaryTree obj = new MinimumDepthOfBinaryTree();
        System.out.println(obj.minDepth(new TreeNode()));
    }
}
