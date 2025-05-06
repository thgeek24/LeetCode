/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m236;

import leetcode.TreeNode;

/**
 * LeetCode 236
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/05/06 13:27
 */
public class LowestCommonAncestorOfABinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        var left = lowestCommonAncestor(root.left, p, q);
        var right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        if (left != null) {
            return left;
        }
        return right;
    }
}
