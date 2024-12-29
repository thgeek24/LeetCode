/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.e145;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 145
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/14 11:40
 */
public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        addNodes(root, res);
        return res;
    }

    private void addNodes(TreeNode root, List<Integer> res) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            res.add(root.val);
        } else if (root.right == null) {
            addNodes(root.left, res);
            res.add(root.val);
        } else if (root.left == null) {
            addNodes(root.right, res);
            res.add(root.val);
        } else {
            addNodes(root.left, res);
            addNodes(root.right, res);
            res.add(root.val);
        }
    }
}
