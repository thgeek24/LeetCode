/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package interview;

/**
 * 面试题
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/25 18:55
 */
public class Stock {
    public int maxProfit(int[] prices) {
        int[] dp = new int[prices.length];
        int min = prices[0];
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > min) {
                dp[i] = prices[i] - min;
                max = Math.max(max, dp[i]);
            }
            min = Math.min(prices[i], min);
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}
