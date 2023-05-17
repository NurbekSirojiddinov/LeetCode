package leetcode.tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNodeII {
    public TreeNode connect(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> stack = new ArrayDeque<>();
        stack.add(root);

        while (!stack.isEmpty()) {
            int size = stack.size();
            while (size > 0 && !stack.isEmpty()) {
                TreeNode node = stack.poll();
                size--;
                if (size == 0) {
                    node.next = null;
                } else {
                    node.next = stack.peek();
                }
                if (node.left != null) {
                    stack.add(node.left);
                }
                if (node.right != null) {
                    stack.add(node.right);
                }
            }
        }
        return root;
    }

    public static void main(String[] args) {
        PopulatingNextRightPointersInEachNodeII obj = new PopulatingNextRightPointersInEachNodeII();
        System.out.println(obj.connect(new TreeNode()));
    }
}
