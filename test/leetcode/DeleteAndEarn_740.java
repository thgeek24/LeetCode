/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 740
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/17 09:35
 */
public class DeleteAndEarn_740 {
    public int deleteAndEarn(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int len = 20001;
        int[] counts = new int[len];
        for (int num : nums) {
            counts[num]++;
        }
        int[] dp = new int[len];
        for (int i = 1; i < len; i++) {
            int dp1 = i > 2 ? dp[i - 3] : 0;
            int dp2 = i > 1 ? dp[i - 2] : 0;
            dp[i] = Math.max(dp1, dp2) + i * counts[i];
        }
        return Math.max(dp[len - 1], dp[len - 2]);
    }
}
