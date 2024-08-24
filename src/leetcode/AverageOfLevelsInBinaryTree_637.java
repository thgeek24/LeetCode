/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 637
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/24 09:36
 */
public class AverageOfLevelsInBinaryTree_637 {
    private List<List<Long>> nums;

    public List<Double> averageOfLevels(TreeNode root) {
        nums = new ArrayList<>();
        fillNums(root, 0);
        List<Double> averages = new ArrayList<>();
        for (List<Long> numArr : nums) {
            long sum = numArr.stream()
                    .mapToLong(item -> item)
                    .sum();
            averages.add((double) sum / numArr.size());
        }

        return averages;
    }

    private void fillNums(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (nums.size() <= level) {
            nums.add(new ArrayList<>());
        }
        List<Long> numArr = nums.get(level);
        numArr.add((long) root.val);
        fillNums(root.left, level + 1);
        fillNums(root.right, level + 1);
    }
}
