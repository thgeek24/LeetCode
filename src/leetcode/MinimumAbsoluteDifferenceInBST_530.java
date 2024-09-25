/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 530
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/23 19:45
 */
public class MinimumAbsoluteDifferenceInBST_530 {
    private Integer prev;
    private int minDiff;

    public int getMinimumDifference(TreeNode root) {
        prev = null;
        minDiff = Integer.MAX_VALUE;
        inOrderTraversal(root);
        return minDiff;
    }

    private void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        // Traverse the left subtree
        inOrderTraversal(node.left);

        // Compute the difference with the previous value
        if (prev != null) {
            minDiff = Math.min(minDiff, node.val - prev);
        }
        prev = node.val;

        // Traverse the right subtree
        inOrderTraversal(node.right);
    }
}
