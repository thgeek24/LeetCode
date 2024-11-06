/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m790;

/**
 * LeetCode 790
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/06 20:53
 */
public class DominoAndTrominoTiling {
    public int numTilings(int n) {
        long[] dp = new long[n + 3];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 5;
        for (int i = 3; i < n; i++) {
            dp[i] = (dp[i - 1] * 2 + dp[i - 3]) % 1000000007;
        }
        return (int) dp[n - 1];
    }
}
