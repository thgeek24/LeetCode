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
    public int numRollsToTarget(int n, int k, int target) {
        final int mod = 1_000_000_007;
        long[][] dp = new long[n + 1][target + 1];

        for (int j = 1; j <= k && j <= target; j++) {
            dp[1][j] = 1;
        }
        for (int i = 2; i <= n; i++) {
            int prevDice = i - 1;
            int prevTarget = prevDice;
            while (prevTarget <= target && dp[prevDice][prevTarget] > 0) {
                for (int die = 1; die <= k; die++) {
                    int tempTarget = prevTarget + die;
                    if (tempTarget > target) {
                        continue;
                    }
                    dp[i][tempTarget] += (int) (dp[prevDice][prevTarget] % mod);
                }
                prevTarget++;
            }
        }

        return (int) (dp[n][target] % mod);
    }
}
