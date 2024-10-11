/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h124;

import leetcode.TreeNode;

/**
 * LeetCode 124
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/09 09:48
 */
public class BinaryTreeMaximumPathSum {
    private int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxPathHelper(root);
        return maxSum;
    }

    private int maxPathHelper(TreeNode root) {
        if (root.left == null && root.right == null) {
            maxSum = Math.max(maxSum, root.val);
            return root.val;
        }

        if (root.left == null) {
            int rightMax = maxPathHelper(root.right);
            if (rightMax > 0) {
                maxSum = Math.max(maxSum, root.val + rightMax);
                return root.val + rightMax;
            }
            maxSum = Math.max(maxSum, root.val);
            return root.val;
        }

        if (root.right == null) {
            int leftMax = maxPathHelper(root.left);
            if (leftMax > 0) {
                maxSum = Math.max(maxSum, root.val + leftMax);
                return root.val + leftMax;
            }
            maxSum = Math.max(maxSum, root.val);
            return root.val;
        }

        int leftMax = maxPathHelper(root.left);
        int rightMax = maxPathHelper(root.right);
        int childMax = Math.max(leftMax, rightMax);
        if (childMax > 0) {
            if (leftMax > 0 && rightMax > 0) {
                maxSum = Math.max(maxSum, root.val + leftMax + rightMax);
            } else {
                maxSum = Math.max(maxSum, root.val + childMax);
            }
            return root.val + childMax;
        }
        maxSum = Math.max(maxSum, root.val);
        return root.val;
    }
}
