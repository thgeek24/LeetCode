/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 1314
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/19 11:01
 */
public class MatrixBlockSum_1314 {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;

        int[][] prefixSum = new int[m + 1][n + 1];
        for (int i = 1; i < prefixSum.length; i++) {
            for (int j = 1; j < prefixSum[0].length; j++) {
                prefixSum[i][j] = prefixSum[i - 1][j] + prefixSum[i][j - 1]
                        - prefixSum[i - 1][j - 1] + mat[i - 1][j - 1];
            }
        }

        int[][] res = new int[m][n];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                int rMin = Math.max(0, i - k);
                int rMax = Math.min(m - 1, i + k);
                int cMin = Math.max(0, j - k);
                int cMax = Math.min(n - 1, j + k);
                res[i][j] = prefixSum[rMax + 1][cMax + 1] - prefixSum[rMin][cMax + 1]
                        - prefixSum[rMax + 1][cMin] + prefixSum[rMin][cMin];
            }
        }
        return res;
    }
}
