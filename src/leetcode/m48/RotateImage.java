/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m48;

/**
 * LeetCode 48
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/02/13 09:56
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        int offset = len / 2;
        boolean evenLen = len % 2 == 0;
        for (int i = 0; i < offset; i++) {
            for (int j = i; j < len - i - 1; j++) {
                int m = i, n = j, pre = matrix[m][n];
                for (int k = 0; k < 4; k++) {
                    int nextM = n, nextN = 2 * offset - m - (evenLen ? 1 : 0);
                    int tmp = matrix[nextM][nextN];
                    matrix[nextM][nextN] = pre;
                    pre = tmp;
                    m = nextM;
                    n = nextN;
                }
            }
        }
    }
}
