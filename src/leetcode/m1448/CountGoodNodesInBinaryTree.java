/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1448;

import leetcode.TreeNode;

/**
 * LeetCode 1448
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/04 20:46
 */
public class CountGoodNodesInBinaryTree {
    public int goodNodes(TreeNode root) {
        int left = goodNodes(root.left, root.val);
        int right = goodNodes(root.right, root.val);
        return 1 + left + right;
    }

    private int goodNodes(TreeNode root, int max) {
        if (root == null) {
            return 0;
        }
        if (root.val >= max) {
            return 1 + goodNodes(root.left, root.val) + goodNodes(root.right, root.val);
        }
        return goodNodes(root.left, max) + goodNodes(root.right, max);
    }
}
