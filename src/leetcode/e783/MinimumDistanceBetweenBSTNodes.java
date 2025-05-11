/*
 * Copyright (c) 2024-2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e783;

import leetcode.TreeNode;
import leetcode.e530.MinimumAbsoluteDifferenceInBST;

/**
 * LeetCode 783
 * Similar to {@link MinimumAbsoluteDifferenceInBST}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/23 21:27
 */
public class MinimumDistanceBetweenBSTNodes {
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
