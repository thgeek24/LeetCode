/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode 1162
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/06 20:06
 */
public class AsFarFromLandAsPossible_1162 {
    public int maxDistance(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    grid[i][j] = 0;
                    queue.offer(new int[]{i, j});
                } else {
                    grid[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int res = -1;
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            for (int[] dir : dirs) {
                int x = cell[0] + dir[0];
                int y = cell[1] + dir[1];
                if (x >= 0 && x < row && y >= 0 && y < col && grid[x][y] > grid[cell[0]][cell[1]] + 1) {
                    queue.offer(new int[]{x, y});
                    grid[x][y] = grid[cell[0]][cell[1]] + 1;
                    res = Math.max(res, grid[x][y]);
                }
            }
        }

        return res;
    }
}
