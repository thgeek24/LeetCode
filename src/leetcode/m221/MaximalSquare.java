/*
 * Copyright (c) 2024-2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m221;

/**
 * LeetCode 221
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/21 16:39
 */
public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m + 1][n + 1];

        int max = 0;
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                    max = Math.max(dp[i][j], max);
                }
            }
        }

        return max * max;
    }
}
