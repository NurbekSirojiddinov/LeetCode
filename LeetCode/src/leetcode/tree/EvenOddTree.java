package leetcode.tree;

import java.util.Stack;

public class EvenOddTree {
    public boolean isEvenOddTree(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int index = 0;

        while (!stack.isEmpty()) {
            int len = stack.size();
            int prev = 0;

            while (len != 0) {
                TreeNode node = stack.pop();
                if (node.left != null) {
                    stack.add(stack.size(), node.left);
                }
                if (node.right != null) {
                    stack.add(stack.size(), node.right);
                }
                if (index % 2 == 0 && (node.val % 2 == 0 || node.val <= prev)) {
                    return false;
                } else if (index % 2 == 1 && (node.val % 2 == 1 || prev != 0 && node.val >= prev)) {
                    return false;
                }
                prev = node.val;
                len--;
            }
            index++;
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(4));
        System.out.println(new EvenOddTree().isEvenOddTree(root));
    }
}

