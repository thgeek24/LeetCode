package leetcode;

/**
 * @author taohong on 03/09/2018
 */
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    }

    public static void main(String[] args) {
        System.out.println(((3 > 2) ? 3 : 2) + 1);
    }
}
