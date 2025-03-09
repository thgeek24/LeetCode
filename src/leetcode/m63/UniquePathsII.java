/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m63;

/**
 * LeetCode 63
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/28 12:31
 */
public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for (int i = 1; i < m; i++) {
            if (obstacleGrid[i][0] != 1 && dp[i - 1][0] != 0) {
                dp[i][0] = 1;
            }
        }
        for (int j = 1; j < n; j++) {
            if (obstacleGrid[0][j] != 1 && dp[0][j - 1] != 0) {
                dp[0][j] = 1;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                    continue;
                }
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
