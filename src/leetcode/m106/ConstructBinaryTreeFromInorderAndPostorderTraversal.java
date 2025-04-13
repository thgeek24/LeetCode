/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m106;

import leetcode.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 106
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/05 09:27
 */
public interface ConstructBinaryTreeFromInorderAndPostorderTraversal {
    TreeNode buildTree(int[] inorder, int[] postorder);

    class Solution1 implements ConstructBinaryTreeFromInorderAndPostorderTraversal {
        private int[] inorder;
        private int[] postorder;
        private final Map<Integer, Integer> inorderIndexes = new HashMap<>();

        @Override
        public TreeNode buildTree(int[] inorder, int[] postorder) {
            if (inorder.length == 1) {
                return new TreeNode(inorder[0]);
            }
            init(inorder, postorder);
            return buildTreeHelper(0, inorder.length - 1, 0, postorder.length - 1);
        }

        private void init(int[] inorder, int[] postorder) {
            this.inorder = inorder;
            this.postorder = postorder;
            for (int i = 0; i < inorder.length; i++) {
                inorderIndexes.put(inorder[i], i);
            }
        }

        private TreeNode buildTreeHelper(int inStart, int inEnd, int postStart, int postEnd) {
            if (inStart == inEnd) {
                return new TreeNode(inorder[inStart]);
            }
            if (inStart > inEnd) {
                return null;
            }
            int rootVal = postorder[postEnd];
            int rootIndexIn = inorderIndexes.get(rootVal);
            int leftLen = rootIndexIn - inStart;
            TreeNode root = new TreeNode(rootVal);
            root.left = buildTreeHelper(inStart, rootIndexIn - 1, postStart, postStart + leftLen - 1);
            root.right = buildTreeHelper(rootIndexIn + 1, inEnd, postStart + leftLen, postEnd - 1);
            return root;
        }
    }
}
