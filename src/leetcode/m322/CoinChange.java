/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m322;

import java.util.Arrays;

/**
 * LeetCode 322
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/01/19 10:33
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        var dp = new long[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin > i) {
                    break;
                }
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : (int) dp[amount];
    }
}
