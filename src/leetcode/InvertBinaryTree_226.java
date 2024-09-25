/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 226
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/25 20:44
 */
public class InvertBinaryTree_226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return root;
        }
        if (root.left == null) {
            TreeNode oldRight = root.right;
            TreeNode newLeft = new TreeNode(oldRight.val, invertTree(oldRight.right), invertTree(oldRight.left));
            return new TreeNode(root.val, newLeft, null);
        }
        if (root.right == null) {
            TreeNode oldLeft = root.left;
            TreeNode newRight = new TreeNode(oldLeft.val, invertTree(oldLeft.right), invertTree(oldLeft.left));
            return new TreeNode(root.val, null, newRight);
        }
        TreeNode oldRight = root.right;
        TreeNode newLeft = new TreeNode(oldRight.val, invertTree(oldRight.right), invertTree(oldRight.left));
        TreeNode oldLeft = root.left;
        TreeNode newRight = new TreeNode(oldLeft.val, invertTree(oldLeft.right), invertTree(oldLeft.left));
        return new TreeNode(root.val, newLeft, newRight);
    }
}
