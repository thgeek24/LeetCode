/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.e111;

import leetcode.TreeNode;

/**
 * LeetCode 111
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/14 11:15
 */
public class MinimumDepthOfBinaryTree {
    private int minDepth = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {
        checkDepth(root, 0);
        return minDepth;
    }

    private void checkDepth(TreeNode root, int depth) {
        if (root == null) {
            minDepth = Math.min(depth, minDepth);
        } else if (root.left == null && root.right == null) {
            minDepth = Math.min(depth + 1, minDepth);
        } else if (root.left == null) {
            checkDepth(root.right, depth + 1);
        } else if (root.right == null) {
            checkDepth(root.left, depth + 1);
        } else {
            checkDepth(root.left, depth + 1);
            checkDepth(root.right, depth + 1);
        }
    }
}
