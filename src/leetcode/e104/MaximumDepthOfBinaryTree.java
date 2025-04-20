/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e104;

import leetcode.TreeNode;

/**
 * LeetCode 104
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/04/05 10:44
 */
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
