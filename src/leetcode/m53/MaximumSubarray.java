/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m53;

/**
 * LeetCode 53
 *
 * @author Tao Hong
 * @version 2.0
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int curMax = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : nums) {
            curMax = Math.max(curMax + num, num);
            maxSum = Math.max(maxSum, curMax);
        }

        return maxSum;
    }
}
