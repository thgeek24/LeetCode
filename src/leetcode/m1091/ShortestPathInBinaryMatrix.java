/*
 * Copyright (c) 2024-2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m1091;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode 1091
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/11 21:09
 */
public class ShortestPathInBinaryMatrix {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] != 0 || grid[n - 1][n - 1] != 0) {
            return -1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    grid[i][j] = Integer.MAX_VALUE;
                } else {
                    grid[i][j] = -1;
                }
            }
        }
        grid[0][0] = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});

        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}, {-1, 1}, {1, -1}, {-1, -1}, {1, 1}};
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            for (int[] dir : dirs) {
                int x = cell[0] + dir[0];
                int y = cell[1] + dir[1];
                if (x >= 0 && x < n && y >= 0 && y < n && grid[x][y] > grid[cell[0]][cell[1]] + 1) {
                    grid[x][y] = grid[cell[0]][cell[1]] + 1;
                    queue.offer(new int[]{x, y});
                }
            }
        }
        int res = grid[n - 1][n - 1];
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
