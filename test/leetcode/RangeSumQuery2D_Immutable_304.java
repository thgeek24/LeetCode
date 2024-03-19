/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 304
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/19 16:33
 */
public class RangeSumQuery2D_Immutable_304 {
    private final int[][] prefixSum;

    public RangeSumQuery2D_Immutable_304(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        prefixSum = new int[m + 1][n + 1];
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                prefixSum[i][j] = prefixSum[i - 1][j] + prefixSum[i][j - 1] -
                        prefixSum[i - 1][j - 1] + matrix[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int row2_ = row2 + 1;
        int col2_ = col2 + 1;
        return prefixSum[row2_][col2_] - prefixSum[row1][col2_] - prefixSum[row2_][col1] + prefixSum[row1][col1];
    }
}
