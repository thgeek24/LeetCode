/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 486
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/27 09:48
 */
public class PredictTheWinner_486 {
    public boolean predictTheWinner(int[] nums) {
        int len = nums.length;
        int[][] dp = new int[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = nums[i];
        }
        for (int k = 1; k < len; k++) {
            for (int i = 0; i < len - k; i++) {
                int j = i + k;
                dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
            }
        }
        return dp[0][len - 1] >= 0;
    }
}
