/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 576
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/26 09:31
 */
public class OutOfBoundaryPaths_576 {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        if (maxMove == 0) {
            return 0;
        }
        final int mod = 1_000_000_007;
        long[][][] dp = new long[m][n][maxMove];
        dp[startRow][startColumn][0] = 1;
        for (int move = 1; move < maxMove; move++) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    long top = i > 0 ? dp[i - 1][j][move - 1] : 0;
                    long bottom = i < m - 1 ? dp[i + 1][j][move - 1] : 0;
                    long left = j > 0 ? dp[i][j - 1][move - 1] : 0;
                    long right = j < n - 1 ? dp[i][j + 1][move - 1] : 0;
                    dp[i][j][move] = (top + bottom + left + right) % mod;
                }
            }
        }
        long paths = 0;
        for (int move = 0; move < maxMove; move++) {
            for (int i = 0; i < m; i++) {
                paths += dp[i][0][move] + dp[i][n - 1][move];
            }
            for (int j = 0; j < n; j++) {
                paths += dp[0][j][move] + dp[m - 1][j][move];
            }
        }
        return (int) (paths % mod);
    }
}
