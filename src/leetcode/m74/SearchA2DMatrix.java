/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m74;

/**
 * LeetCode 74
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/23 07:52
 */
public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        final int m = matrix.length;
        final int n = matrix[0].length;
        final int len = m * n;

        int left = 0;
        int right = len - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int[] coordinates = convert(mid, n);
            int i = coordinates[0];
            int j = coordinates[1];
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }

    private int[] convert(int index, int cols) {
        int i = index / cols;
        int j = index % cols;
        return new int[]{i, j};
    }
}
