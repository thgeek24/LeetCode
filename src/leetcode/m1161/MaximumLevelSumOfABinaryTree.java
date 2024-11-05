/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1161;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 1161
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/04 21:46
 */
public class MaximumLevelSumOfABinaryTree {
    private final List<Integer> levelSums = new ArrayList<>();

    public int maxLevelSum(TreeNode root) {
        levelSums.add(root.val);
        maxLevelSum(root.left, 2);
        maxLevelSum(root.right, 2);
        int max = Integer.MIN_VALUE;
        int level = 1;
        for (int i = 0; i < levelSums.size(); i++) {
            if (levelSums.get(i) > max) {
                max = levelSums.get(i);
                level = i + 1;
            }
        }
        return level;
    }

    private void maxLevelSum(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        while (levelSums.size() < level) {
            levelSums.add(0);
        }
        levelSums.set(level - 1, levelSums.get(level - 1) + root.val);
        maxLevelSum(root.left, level + 1);
        maxLevelSum(root.right, level + 1);
    }
}
