/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m2471;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * LeetCode 2471
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/23 08:52
 */
public class MinimumNumberOfOperationsToSortABinaryTreeByLevel {
    private List<List<Integer>> leveledNums;

    public int minimumOperations(TreeNode root) {
        leveledNums = new ArrayList<>();
        addNum(root, 0);

        int count = 0;
        for (List<Integer> nums : leveledNums) {
            count += minSwaps(nums);
        }
        return count;
    }

    private void addNum(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        if (leveledNums.size() <= level) {
            leveledNums.add(new ArrayList<>());
        }
        leveledNums.get(level).add(node.val);
        addNum(node.left, level + 1);
        addNum(node.right, level + 1);
    }

    private int minSwaps(List<Integer> nums) {
        int n = nums.size();
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums.get(i);
            pairs[i][1] = i;
        }
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));

        int swaps = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i] || pairs[i][1] == i) {
                continue;
            }

            int j = i;
            int cycleSize = 0;
            while (!visited[j]) {
                visited[j] = true;
                j = pairs[j][1];
                cycleSize++;
            }

            if (cycleSize > 0) {
                swaps += cycleSize - 1;
            }
        }

        return swaps;
    }
}
