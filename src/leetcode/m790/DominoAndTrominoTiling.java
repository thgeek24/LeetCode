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
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 5;
        long[] dp = new long[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;
        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        return (int) dp[n] % 1000000007;
    }
}
