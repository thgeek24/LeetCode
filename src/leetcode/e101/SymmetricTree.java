/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e101;


import leetcode.TreeNode;

/**
 * LeetCode 101
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/04/08 07:13
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }

        return isSymmetric(root1.left, root2.right) && isSymmetric(root1.right, root2.left);
    }
}
