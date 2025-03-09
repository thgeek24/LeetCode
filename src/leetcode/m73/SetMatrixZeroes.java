/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m73;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode 73
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/02/14 08:44
 */
public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> columnSet = new HashSet<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rowSet.add(i);
                    columnSet.add(j);
                }
            }
        }

        rowSet.forEach(item -> {
            for (int j = 0; j < n; j++) {
                matrix[item][j] = 0;
            }
        });
        columnSet.forEach(item -> {
            for (int i = 0; i < m; i++) {
                matrix[i][item] = 0;
            }
        });
    }
}
