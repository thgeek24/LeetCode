/*
 * Copyright (c) 2024-2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e112;

import leetcode.TreeNode;

/**
 * LeetCode 112
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/26 10:55
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        } else if (root.val == targetSum && root.left == null && root.right == null) {
            return true;
        } else {
            int newTargetSum = targetSum - root.val;
            return hasPathSum(root.left, newTargetSum) || hasPathSum(root.right, newTargetSum);
        }
    }
}
