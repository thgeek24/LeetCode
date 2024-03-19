/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 377
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/10 19:26
 */
public class CombinationSumIV_377 {
    /**
     * Transition formula: dp[i] += dp[i - num], where num <= i.
     * For each i, consider every num that is no greater than i.
     * Unlike {@link CoinChangeII_518} where the outer loop is of coin
     */
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 0; i <= target; i++) {
            for (int num : nums) {
                if (num > i) {
                    continue;
                }
                dp[i] += dp[i - num];
            }
        }
        return dp[target];
    }
}
