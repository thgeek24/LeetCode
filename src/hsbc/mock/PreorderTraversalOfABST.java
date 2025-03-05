/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package hsbc.mock;

import hsbc.mock.support.BinaryTreeNode;
import leetcode.m1008.ConstructBinarySearchTreeFromPreorderTraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * HSBC Mock from naukri.com.
 * <br/>
 * See {@link ConstructBinarySearchTreeFromPreorderTraversal}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/04 17:35
 */
public class PreorderTraversalOfABST {
    public static BinaryTreeNode<Integer> prorderToBST(ArrayList<Integer> preorder) {
        return buildTree(preorder, 0, preorder.size());
    }

    private static BinaryTreeNode<Integer> buildTree(List<Integer> preorder, int start, int end) {
        if (start >= preorder.size()) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(preorder.get(start));
        int[] leaves = findLeaves(preorder, root.data, start + 1, end);
        if (leaves[0] != -1) {
            root.left = buildTree(preorder, leaves[0], leaves[1] != -1 ? leaves[1] : end);
        }
        if (leaves[1] != -1) {
            root.right = buildTree(preorder, leaves[1], end);
        }
        return root;
    }

    private static int[] findLeaves(List<Integer> preorder, int num, int start, int end) {
        int[] leaves = {-1, -1};
        for (int i = start; i < end; i++) {
            if (leaves[0] == -1 && preorder.get(i) < num) {
                leaves[0] = i;
            }
            if (preorder.get(i) > num) {
                leaves[1] = i;
                break;
            }
        }
        return leaves;
    }
}
