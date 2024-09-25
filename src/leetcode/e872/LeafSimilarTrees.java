/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.e872;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 872
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/17 00:37
 */
public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafs1 = new ArrayList<>();
        List<Integer> leafs2 = new ArrayList<>();
        addLeafNodes(root1, leafs1);
        addLeafNodes(root2, leafs2);
        if (leafs1.size() != leafs2.size()) {
            return false;
        }
        for (int i = 0; i < leafs1.size(); i++) {
            if (!leafs1.get(i).equals(leafs2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private void addLeafNodes(TreeNode root, List<Integer> leafs) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            leafs.add(root.val);
            return;
        }
        addLeafNodes(root.left, leafs);
        addLeafNodes(root.right, leafs);
    }
}
