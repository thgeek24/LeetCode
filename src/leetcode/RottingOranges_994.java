/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode 994
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/10 15:59
 */
public class RottingOranges_994 {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int freshCount = 0;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j, 0});
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }

        int minutes = 0;
        int[][] dirs = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            for (int[] dir : dirs) {
                int x = cell[0] + dir[0];
                int y = cell[1] + dir[1];
                int addTime = cell[2];
                if (x >= 0 && x < row && y >= 0 && y < col && grid[x][y] == 1) {
                    minutes = Math.max(addTime + 1, minutes);
                    grid[x][y] = 2;
                    freshCount--;
                    queue.add(new int[]{x, y, addTime + 1});
                }
            }
        }

        if (freshCount > 0) {
            return -1;
        }
        return minutes;
    }
}
