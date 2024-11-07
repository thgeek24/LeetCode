/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m105;

import leetcode.TreeNode;

/**
 * LeetCode 105
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/07 11:36
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, inorder, 0, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int[] inorder, int preIndex, int inIndexStart, int inIndexEnd) {
        if (inIndexStart == inIndexEnd) {
            return new TreeNode(inorder[inIndexStart]);
        }
        int inTop = -1;
        for (int i = inIndexStart; i <= inIndexEnd; i++) {
            if (inorder[i] == preorder[preIndex]) {
                inTop = i;
                break;
            }
        }
        if (inTop == -1) {
            return null;
        }
        if (inTop == inIndexStart) {
            TreeNode right = buildTree(preorder, inorder, preIndex + 1, inTop + 1, inIndexEnd);
            return new TreeNode(inorder[inTop], null, right);
        }
        if (inTop == inIndexEnd) {
            TreeNode left = buildTree(preorder, inorder, preIndex + 1, inIndexStart, inTop - 1);
            return new TreeNode(inorder[inTop], left, null);
        }
        TreeNode left = buildTree(preorder, inorder, preIndex + 1, inIndexStart, inTop - 1);
        TreeNode right = buildTree(preorder, inorder, preIndex + inTop - inIndexStart + 1, inTop + 1, inIndexEnd);
        return new TreeNode(inorder[inTop], left, right);
    }
}
