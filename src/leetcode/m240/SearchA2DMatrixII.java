/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m240;

/**
 * LeetCode 240
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/13 09:32
 */
public class SearchA2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
