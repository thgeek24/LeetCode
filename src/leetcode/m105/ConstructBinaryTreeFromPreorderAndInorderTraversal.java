/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m105;

import leetcode.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 105
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/07 11:36
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    private int[] preorder;
    private int[] inorder;
    private Map<Integer, Integer> preorderMap;
    private Map<Integer, Integer> inorderMap;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        init(preorder, inorder);
        return buildTree(0, preorder.length - 1, 0, inorder.length - 1);
    }

    private void init(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        this.preorderMap = buildMap(preorder);
        this.inorderMap = buildMap(inorder);
    }

    private TreeNode buildTree(int preStart, int preEnd, int inStart, int inEnd) {
        if (preStart > preEnd) {
            return null;
        }
        if (preStart == preEnd) {
            return new TreeNode(preorder[preStart]);
        }
        final int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);

        final int inRootIdx = inorderMap.get(rootVal);
        if (inRootIdx == inStart) {
            root.left = null;
            root.right = buildTree(preStart + 1, preEnd, inStart, inEnd);
            return root;
        }

        int inLeftEndVal = inorder[inRootIdx - 1];
        int preLeftEnd = preorderMap.get(inLeftEndVal);

        root.left = buildTree(preStart + 1, preLeftEnd, inStart, inRootIdx - 1);
        root.right = buildTree(preLeftEnd + 1, preEnd, inRootIdx + 1, inEnd);
        return root;
    }

    private Map<Integer, Integer> buildMap(int[] order) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length; i++) {
            map.put(order[i], i);
        }
        return map;
    }
}
