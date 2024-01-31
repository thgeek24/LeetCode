/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * Test for {@link LastStoneWeightII_1049}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/22 12:00
 */
public class LastStoneWeightII_1049 {
    public int lastStoneWeightII(int[] stones) {
        int totalSum = 0;
        for (int stone : stones) {
            totalSum += stone;
        }

        int target = totalSum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int stone : stones) {
            for (int i = target; i >= stone; i--) {
                dp[i] = dp[i] || dp[i - stone];
            }
        }

        for (int i = target; ; i--) {
            if (dp[i]) {
                return totalSum - i * 2;
            }
        }
    }
}