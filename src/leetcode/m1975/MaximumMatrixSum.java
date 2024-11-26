/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1975;

/**
 * LeetCode 1975
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/24 08:52
 */
public class MaximumMatrixSum {
    public long maxMatrixSum(int[][] matrix) {
        int count = 0;
        long sum = 0;
        long min = Integer.MAX_VALUE;
        for (int[] rows : matrix) {
            for (int col : rows) {
                if (col < 0) {
                    count++;
                }
                int absCol = Math.abs(col);
                sum += absCol;
                min = Math.min(min, absCol);
            }
        }

        if (count % 2 == 1) {
            sum -= 2 * min;
        }
        return sum;
    }
}
