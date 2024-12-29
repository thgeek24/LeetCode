/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.e144;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 144
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/14 11:34
 */
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        addNodes(root, res);
        return res;
    }

    private void addNodes(TreeNode root, List<Integer> res) {
        if (root != null) {
            res.add(root.val);
            addNodes(root.left, res);
            addNodes(root.right, res);
        }
    }
}
