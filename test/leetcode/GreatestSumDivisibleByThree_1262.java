/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 1262
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/27 11:50
 */
public class GreatestSumDivisibleByThree_1262 {
    public int maxSumDivThree(int[] nums) {
        // dp[i] stores the maximum sum which gives remainder i when divided by 3.
        int[] dp = {0, 0, 0};

        for (int num : nums) {
            // Use a temporary array to avoid updating dp[] in-place which affects subsequent calculations within the same iteration.
            int[] temp = new int[3];
            System.arraycopy(dp, 0, temp, 0, dp.length);

            for (int i = 0; i < 3; i++) {
                // Calculate new sum by adding current number to dp[i] and find its remainder when divided by 3.
                int sum = num + temp[i];
                int rem = sum % 3;
                // Update dp[rem] if this new sum leads to a larger value than previously recorded.
                dp[rem] = Math.max(dp[rem], sum);
            }
        }

        // dp[0] now contains the maximum sum divisible by 3.
        return dp[0];
    }
}
