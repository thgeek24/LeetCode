/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 1155
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/28 11:07
 */
public class NumberOfDiceRollsWithTargetSum_1155 {
    public int numRollsToTarget(int n, int f, int target) {
        final int MOD = 1000000007;
        int[][] dp = new int[n + 1][target + 1];
        dp[0][0] = 1;  // Base case

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                for (int k = 1; k <= f; k++) {
                    if (j - k >= 0) {
                        dp[i][j] = (dp[i][j] + dp[i - 1][j - k]) % MOD;
                    }
                }
            }
        }

        return dp[n][target];
    }
}
