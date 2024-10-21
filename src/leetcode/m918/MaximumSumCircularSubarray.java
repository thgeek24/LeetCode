/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m918;

/**
 * LeetCode 918
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/22 07:29
 */
public class MaximumSumCircularSubarray {
    public int maxSubarraySumCircular(int[] nums) {
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        int[] dp = new int[len];
        for (int i = 0; i < len; i++) {
            dp[i] = nums[i];
            max = Math.max(max, dp[i]);
        }

        int offset = 1;
        while (offset < len) {
            for (int i = 0; i < len; i++) {
                int j = (i + offset) % len;
                dp[i] += nums[j];
                max = Math.max(max, dp[i]);
            }
            offset++;
        }

        return max;
    }
}
