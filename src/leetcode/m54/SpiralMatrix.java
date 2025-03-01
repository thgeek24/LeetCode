/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m54;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 54
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/02/12 08:55
 */
public class SpiralMatrix {
    private final int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] visited = new boolean[m][n];

        List<Integer> res = new ArrayList<>();
        int i = 0;
        int j = 0;
        int dir = 0;
        while (true) {
            visited[i][j] = true;
            res.add(matrix[i][j]);

            int iNext = i + directions[dir][0];
            int jNext = j + directions[dir][1];
            if (isReachable(visited, m, n, iNext, jNext)) {
                i = iNext;
                j = jNext;
                continue;
            }

            dir = (dir + 1) % 4;
            i += directions[dir][0];
            j += directions[dir][1];
            if (!isReachable(visited, m, n, i, j)) {
                break;
            }
        }
        return res;
    }

    private boolean isReachable(boolean[][] visited, int m, int n, int i, int j) {
        return i >= 0 && i < m && j >= 0 && j < n && !visited[i][j];
    }
}
