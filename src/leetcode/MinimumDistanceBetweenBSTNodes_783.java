/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 783
 * Similar to {@link MinimumAbsoluteDifferenceInBST_530}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/23 21:27
 */
public class MinimumDistanceBetweenBSTNodes_783 {
    private Integer prev;
    private int min;

    public int minDiffInBST(TreeNode root) {
        prev = null;
        min = Integer.MAX_VALUE;
        inOrderTraversal(root);
        return min;
    }

    private void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        if (prev != null) {
            min = Math.min(min, root.val - prev);
        }
        prev = root.val;
        inOrderTraversal(root.right);
    }
}
