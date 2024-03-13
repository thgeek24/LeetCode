/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 1039
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/12 10:11
 */
public class MinimumScoreTriangulationOfPolygon_1039 {
    public int minScoreTriangulation(int[] values) {
        int len = values.length;
        int[][] dp = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (j > i + 2) {
                    dp[i][j] = Integer.MAX_VALUE;
                } else if (j == i + 2) {
                    dp[i][j] = values[i] * values[i + 1] * values[i + 2];
                }
            }
        }

        for (int i = 3; i < len; i++) {
            for (int m = 0; m + i < len; m++) {
                int n = m + i;
                for (int k = m + 1; k < n; k++) {
                    dp[m][n] = Math.min(dp[m][n], dp[m][k] + dp[k][n] + values[m] * values[k] * values[n]);
                }
            }
        }
        return dp[0][len - 1];
    }
}
