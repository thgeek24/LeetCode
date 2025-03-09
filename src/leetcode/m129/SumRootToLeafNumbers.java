/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m129;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 129
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/08 08:20
 */
public class SumRootToLeafNumbers {
    private final List<List<Integer>> paths = new ArrayList<>();

    public int sumNumbers(TreeNode root) {
        addPath(root, new ArrayList<>());
        int res = 0;
        for (List<Integer> path : paths) {
            int digit = 0;
            for (int i = path.size() - 1; i >= 0; i--) {
                res += path.get(i) * (int) Math.pow(10, digit++);
            }
        }
        return res;
    }

    private void addPath(TreeNode root, List<Integer> path) {
        if (root.left == null && root.right == null) {
            path.add(root.val);
            paths.add(path);
            return;
        }
        path.add(root.val);
        List<Integer> right = new ArrayList<>(path);
        if (root.left != null) {
            addPath(root.left, path);
        }
        if (root.right != null) {
            addPath(root.right, right);
        }
    }
}
