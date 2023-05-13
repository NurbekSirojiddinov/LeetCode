package leetcode.tree;

public class ClosestBinarySearchTreeValue {
    double diff = 1000000000;
    int smallestValue = 0;

    public int closestValue(TreeNode root, double target) {
        return dfs(root, target);
    }

    public int dfs(TreeNode root, double target) {
        if (root == null) {
            return smallestValue;
        }

        if (Math.abs(target - root.val) == diff) {
            smallestValue = Math.min(smallestValue, root.val);
        } else if (Math.abs(target - root.val) < diff) {
            diff = Math.abs(target - root.val);
            smallestValue = root.val;
        }

        smallestValue = dfs(root.left, target);
        smallestValue = dfs(root.right, target);

        return smallestValue;
    }

    public static void main(String[] args) {
        ClosestBinarySearchTreeValue obj = new ClosestBinarySearchTreeValue();
        System.out.println(obj.closestValue(new TreeNode(), 3.2));
    }
}
