/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m1008;

import leetcode.TreeNode;

/**
 * LeetCode 1008
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/04 22:48
 */
public class ConstructBinarySearchTreeFromPreorderTraversal {
    public TreeNode bstFromPreorder(int[] preorder) {
        return buildTree(preorder, 0, preorder.length);
    }

    private TreeNode buildTree(int[] preorder, int start, int end) {
        if (start >= preorder.length) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[start]);
        int[] leaves = findLeaves(preorder, root.val, start + 1, end);
        if (leaves[0] != -1) {
            root.left = buildTree(preorder, leaves[0], leaves[1] != -1 ? leaves[1] : end);
        }
        if (leaves[1] != -1) {
            root.right = buildTree(preorder, leaves[1], end);
        }
        return root;
    }

    private int[] findLeaves(int[] preorder, int num, int start, int end) {
        int[] leaves = {-1, -1};
        for (int i = start; i < end; i++) {
            if (leaves[0] == -1 && preorder[i] < num) {
                leaves[0] = i;
            }
            if (preorder[i] > num) {
                leaves[1] = i;
                break;
            }
        }
        return leaves;
    }
}
