/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m2415;

import leetcode.TreeNode;

/**
 * LeetCode 2415
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/20 09:27
 */
public class ReverseOddLevelsOfBinaryTree {
    public TreeNode reverseOddLevels(TreeNode root) {
        if (root == null) return null;

        // Start DFS traversal with root's children (level 1 is odd)
        dfs(root.left, root.right, 1);
        return root;
    }

    private void dfs(TreeNode left, TreeNode right, int level) {
        if (left == null || right == null) return;

        // If current level is odd, swap values of the two nodes
        if (level % 2 == 1) {
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        }

        // Recursively process the next level
        dfs(left.left, right.right, level + 1);
        dfs(left.right, right.left, level + 1);
    }
}
