/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.Arrays;

/**
 * LeetCode 45
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/19 09:53
 */
public class JumpGameII_45 {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            int steps = nums[i];
            for (int j = 1; j <= steps && j + i < nums.length; j++) {
                dp[i + j] = Math.min(dp[i + j], dp[i] + 1);
            }
        }
        return dp[nums.length - 1];
    }
}
