package leetcode.binary_tree;

import java.util.ArrayList;
import java.util.List;

public class FindAllTheLonelyNodes {
    static List<Integer> list;

    public static List<Integer> getLonelyNodes(TreeNode root) {
        list = new ArrayList<>();
        return helper(root);
    }

    public static List<Integer> helper(TreeNode root) {
        if (root == null) {
            return null;
        }
        helper(root.left);
        helper(root.right);

        if (root.left != null && root.right == null) {
            list.add(root.left.val);
        } else if (root.right != null && root.left == null) {
            list.add(root.right.val);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(getLonelyNodes(new TreeNode()));
    }
}
