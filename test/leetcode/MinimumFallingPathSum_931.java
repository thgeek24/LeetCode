/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 931
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/21 17:37
 */
public class MinimumFallingPathSum_931 {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n + 2];
        System.arraycopy(matrix[0], 0, dp[0], 1, n);
        for (int i = 0; i < n; i++) {
            dp[i][0] = Integer.MAX_VALUE;
            dp[i][n + 1] = Integer.MAX_VALUE;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n + 1; j++) {
                int prevMin = Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i - 1][j + 1]);
                dp[i][j] = matrix[i][j - 1] + prevMin;
            }
        }

        int min = Integer.MAX_VALUE;
        for (int j = 1; j < n + 1; j++) {
            min = Math.min(dp[n - 1][j], min);
        }
        return min;
    }
}
