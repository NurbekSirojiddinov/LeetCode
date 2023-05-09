package leetcode.tree;

import java.util.Stack;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        return dfs(root);
    }

    public TreeNode dfs(TreeNode root) {
        if (root == null) {
            return null;
        }
        dfs(root.left);
        dfs(root.right);

        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;

        return root;
    }

    public static void main(String[] args) {
        InvertBinaryTree binaryTree = new InvertBinaryTree();
        System.out.println(binaryTree.invertTree(new TreeNode()));
        int a = 9;
        int b = 2;
        Double c;
        Stack<Double> stack = new Stack<>();
        stack.add((double) (a /b));
    }
}
