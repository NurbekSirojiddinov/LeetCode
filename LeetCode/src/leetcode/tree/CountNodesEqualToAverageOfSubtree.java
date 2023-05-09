package leetcode.tree;


public class CountNodesEqualToAverageOfSubtree {
    int res = 0;

    public int averageOfSubtree(TreeNode root) {
        helper(root);
        return res;
    }

    public int[] helper(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }
        int[] left = helper(root.left);
        int[] right = helper(root.right);

        int totalSum = left[0] + right[0] + root.val;
        int totalCount = left[1] + right[1] + 1;

        if (totalSum / totalCount == root.val) {
            res++;
        }

        return new int[]{totalSum, totalCount};
    }

    public static void main(String[] args) {
        CountNodesEqualToAverageOfSubtree countNodesEqualToAverageOfSubtree = new CountNodesEqualToAverageOfSubtree();
        System.out.println(countNodesEqualToAverageOfSubtree.averageOfSubtree(new TreeNode()));
    }
}
