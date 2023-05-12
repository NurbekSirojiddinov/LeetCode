package leetcode.tree;

public class CousinsInBinaryTree {
    public boolean isCousins(TreeNode root, int x, int y) {
        int xl = level(root, x, 0);
        int yl = level(root, y, 0);


        return xl == yl && checkParent(root, x, y);
    }


    public int level(TreeNode root, int val, int lvl) {
        if (root == null)
            return -1;
        if (root.val == val)
            return lvl;
        int l = level(root.left, val, lvl + 1);
        if (l != -1)
            return l;
        return level(root.right, val, lvl + 1);
    }

    public boolean checkParent(TreeNode root, int x, int y) {
        if (root == null)
            return true;

        if (root.left != null && root.right != null && ((root.left.val == x && root.right.val == y) || (root.left.val == y && root.right.val == x)))
            return false;

        return checkParent(root.left, x, y) && checkParent(root.right, x, y);
    }

    public static void main(String[] args) {
        CousinsInBinaryTree cousins = new CousinsInBinaryTree();
        System.out.println(cousins.isCousins(new TreeNode(), 1, 4));
    }
}
