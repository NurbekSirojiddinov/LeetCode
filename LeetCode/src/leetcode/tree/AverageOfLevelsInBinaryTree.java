package leetcode.tree;

import java.util.*;

public class AverageOfLevelsInBinaryTree {

    public static List<Double> averageOfLevels(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        List<Double> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        int length;
        stack.add(root);
        while (!stack.isEmpty()) {
            int size = stack.size();
            length = size;
            long sum = 0;

            while (size > 0) {
                TreeNode node = stack.pop();
                if (node.left != null) {
                    stack.add(node.left);
                }
                if (node.right != null) {
                    stack.add(node.right);
                }
                sum += node.val;
                size--;
            }
            ans.add((double) sum / length);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(averageOfLevels(new TreeNode())); //Just an example
    }
}
