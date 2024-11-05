/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1372;

import leetcode.TreeNode;

/**
 * LeetCode 1372
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/04 21:04
 */
public class LongestZigZagPathInABinaryTree {
    private int max = 0;

    public int longestZigZag(TreeNode root) {
        longestZigZag(root.left, true, 0);
        longestZigZag(root.right, false, 0);
        return max;
    }

    private void longestZigZag(TreeNode root, boolean fromLeft, int len) {
        if (root == null) {
            max = Math.max(max, len);
            return;
        }
        len++;
        if (fromLeft) {
            longestZigZag(root.left, true, 0);
            longestZigZag(root.right, false, len);
        } else {
            longestZigZag(root.left, true, len);
            longestZigZag(root.right, false, 0);
        }
    }
}
