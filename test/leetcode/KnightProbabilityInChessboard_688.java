/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 688
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/26 18:38
 */
public class KnightProbabilityInChessboard_688 {
    public double knightProbability(int n, int k, int row, int column) {
        double[][][] dp = new double[n][n][k + 1];
        dp[row][column][0] = 1;
        int[][] directions = {{2, -1}, {2, 1}, {-2, -1}, {-2, 1},
                {1, -2}, {1, 2}, {-1, -2}, {-1, 2}};

        for (int step = 1; step <= k; step++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int[] dir : directions) {
                        int ni = i + dir[0];
                        int nj = j + dir[1];
                        if (ni >= 0 && ni < n && nj >= 0 && nj < n) {
                            dp[i][j][step] += dp[ni][nj][step - 1] / 8.0;
                        }
                    }
                }
            }
        }

        double probability = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                probability += dp[i][j][k];
            }
        }
        return probability;
    }
}
