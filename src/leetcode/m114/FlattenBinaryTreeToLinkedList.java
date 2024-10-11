/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m114;

import leetcode.TreeNode;

/**
 * LeetCode 114
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/06 18:37
 */
public class FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
        flattened(root);
    }

    private TreeNode flattened(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return root;
        }
        if (root.left == null) {
            root.right = flattened(root.right);
            return root;
        }
        if (root.right == null) {
            root.right = flattened(root.left);
            root.left = null;
            return root;
        }
        TreeNode flattenedLeft = flattened(root.left);
        TreeNode flattenedRight = flattened(root.right);
        root.right = flattenedLeft;
        root.left = null;
        TreeNode rightMost = getRightMost(flattenedLeft);
        rightMost.right = flattenedRight;
        return root;
    }

    private TreeNode getRightMost(TreeNode root) {
        TreeNode rightMost = root;
        while (rightMost.right != null) {
            rightMost = rightMost.right;
        }
        return rightMost;
    }
}
