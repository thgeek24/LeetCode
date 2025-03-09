/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.e110;

import leetcode.TreeNode;

/**
 * LeetCode 110
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/05 08:31
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) return -1;  // Left subtree is not balanced.

        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) return -1;  // Right subtree is not balanced.

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;  // Current node is not balanced.

        return Math.max(leftHeight, rightHeight) + 1;  // Return height of subtree.
    }
}
