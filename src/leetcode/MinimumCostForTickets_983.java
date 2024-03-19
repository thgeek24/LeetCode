/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 983
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/11 14:25
 */
public class MinimumCostForTickets_983 {
    public int minCostTickets(int[] days, int[] costs) {
        int len = days[days.length - 1] + 1;
        int[] dp = new int[len];
        int i = 1;
        for (int day : days) {
            while (i < day) {
                dp[i] = dp[i - 1];
                i++;
            }
            int buyOne = dp[i - 1] + costs[0];
            int buySeven = dp[Math.max(i - 7, 0)] + costs[1];
            int buyThirty = dp[Math.max(i - 30, 0)] + costs[2];
            dp[i] = Math.min(Math.min(buyOne, buySeven), buyThirty);
            i++;
        }
        return dp[len - 1];
    }
}
