/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 222
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/24 18:30
 */
public class CountCompleteTreeNodes_222 {
    private int nodeCount;

    public int countNodes(TreeNode root) {
        nodeCount = 0;
        countNodesAux(root);
        return nodeCount;
    }

    private void countNodesAux(TreeNode root) {
        if (root == null) {
            return;
        }
        nodeCount++;
        countNodesAux(root.left);
        countNodesAux(root.right);
    }
}
