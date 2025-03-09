/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m416;

/**
 * LeetCode 416
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/18 10:22
 */
public class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        if (totalSum % 2 != 0) {
            return false;
        }

        int halfSum = totalSum / 2;
        boolean[] dp = new boolean[halfSum + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int i = halfSum; i >= num; i--) {
                dp[i] = dp[i] || dp[i - num];
            }
        }
        return dp[halfSum];
    }
}
