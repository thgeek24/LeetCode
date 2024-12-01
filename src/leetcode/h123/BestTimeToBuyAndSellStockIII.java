/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h123;

/**
 * LeetCode 123
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/01 10:05
 */
public class BestTimeToBuyAndSellStockIII {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n][3][2];

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < 3; j++) {
                if (i == 0) {
                    dp[i][j][0] = 0;
                    dp[i][j][1] = -prices[i];
                    continue;
                }
                dp[i][j][0] = Math.max(dp[i - 1][j][0], dp[i - 1][j][1] + prices[i]);
                dp[i][j][1] = Math.max(dp[i - 1][j][1], dp[i - 1][j - 1][0] - prices[i]);
            }
        }
        return dp[n - 1][2][0];
    }
}
