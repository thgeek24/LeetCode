/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w423;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/10 11:36
 */
public class SumOfGoodSubsequences {
    public int sumOfGoodSubsequences(int[] nums) {
        int len = nums.length;
        int[][][] dp = new int[len][len][2];
        int sum = 0;
        for (int i = 0; i < len; i++) {
            dp[i][i][0] = nums[i];
            dp[i][i][1] = nums[i];
            sum += dp[i][i][0];
        }
        for (int k = 1; k < len; k++) {
            for (int i = 0; i + k < len; i++) {
                int j = i + k;
                if (Math.abs(nums[j] - nums[j - 1]) == 1) {

                }
            }
        }
        return sum;
    }
}
