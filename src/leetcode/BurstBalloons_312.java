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
        newNums[0] = 1;
        newNums[n + 1] = 1;

        int[][] dp = new int[n + 2][n + 2];
        for (int len = 2; len < n + 2; len++) {
            for (int start = 0; start + len < n + 2; start++) {
                int end = start + len;
                for (int i = start + 1; i < end; i++) {
                    int coins = newNums[i] * newNums[start] * newNums[end];
                    dp[start][end] = Math.max(dp[start][end], coins + dp[start][i] + dp[i][end]);

                }
            }
        }
        return dp[0][n + 1];
    }
}
