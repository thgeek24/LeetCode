/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 746
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/09 15:02
 */
public class MinCostClimbingStairs_746 {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length + 1;
        int[] dp = new int[len];
        for (int i = 2; i < len; i++) {
            dp[i] = Math.min(dp[i - 2] + cost[i - 2], dp[i - 1] + cost[i - 1]);
        }
        return dp[len - 1];
    }
}
