package leetcode.tree;

public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return dfs(p, q, true);
    }

    public boolean dfs(TreeNode p, TreeNode q, boolean flag) {
        if (p == null && q == null) {
            return flag;
        }
        if ((p == null || q == null) || (p.val != q.val)) {
            return false;
        }
        return dfs(p.left, q.left, flag) && dfs(p.right, q.right, flag);
    }

    public static void main(String[] args) {
        SameTree tree = new SameTree();
        System.out.println(tree.isSameTree(new TreeNode(), new TreeNode()));
    }
}
