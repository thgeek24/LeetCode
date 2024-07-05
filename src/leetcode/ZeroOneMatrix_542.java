/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode 542
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/05 08:35
 */
public class ZeroOneMatrix_542 {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        Queue<int[]> queue = new LinkedList<>();
        // Initialize distances and enqueue all '0' cells
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                } else {
                    mat[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        // Directions array for moving in 4 possible directions
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // Perform BFS from all zero cells
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            for (int[] dir : dirs) {
                int x = cell[0] + dir[0], y = cell[1] + dir[1];
                if (x >= 0 && x < m && y >= 0 && y < n && mat[x][y] > mat[cell[0]][cell[1]] + 1) {
                    queue.offer(new int[]{x, y});
                    mat[x][y] = mat[cell[0]][cell[1]] + 1;
                }
            }
        }

        return mat;
    }
}
