/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 312
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/18 11:08
 */
public class BurstBalloons_312 {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] newNums = new int[n + 2];
        System.arraycopy(nums, 0, newNums, 1, n);
        newNums[0] = newNums[n + 1] = 1;

        int[][] dp = new int[n + 2][n + 2];

        for (int len = 1; len <= n; len++) {
            for (int start = 1; start <= n - len + 1; start++) {
                int end = start + len - 1;
                for (int k = start; k <= end; k++) {
                    int coins = dp[start][k - 1] + dp[k + 1][end] + newNums[start - 1] * newNums[k] * newNums[end + 1];
                    dp[start][end] = Math.max(dp[start][end], coins);
                }
            }
        }

        return dp[1][n];
    }
}
