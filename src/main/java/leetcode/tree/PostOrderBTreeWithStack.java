package leetcode.tree;

import java.util.Stack;

/**
 * Created by joshua.chi on 6/15/17.
 */
public class PostOrderBTreeWithStack {

    public static void p (TreeNode root) {
        if (null == root) {
            return;
        }

        Stack<TreeNode> stack = new Stack();

        while (root != null || stack.isEmpty() == false) {
            if (root.right != null) {
                stack.push(root);
                stack.push(root.right);
                root = root.left;
            }
            else if (root.right == null) {
                stack.push(root);
                root = root.left;
            }
            else {
                TreeNode top = stack.pop();
                TreeNode peek = stack.peek();
                if (top.right == peek) {
                    TreeNode right = stack.pop();
                    stack.push(top);
                    root = right;
                }else {
                    System.out.println(top.val);
                }
            }
        }

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        root.left = left;
        TreeNode right = new TreeNode(3);
        root.right = right;

        TreeNode left2 = new TreeNode(4);
        left.left = left2;
        TreeNode right2 = new TreeNode(5);
        left.right = right2;

        p(root);

    }
}
