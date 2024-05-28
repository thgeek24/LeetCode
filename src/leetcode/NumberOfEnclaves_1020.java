/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 1020
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/05/28 09:06
 */
public class NumberOfEnclaves_1020 {
    public int numEnclaves(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        for (int i = 0; i < row; i++) {
            dfs(grid, i, 0);
            dfs(grid, i, col - 1);
        }

        for (int j = 1; j < col; j++) {
            dfs(grid, 0, j);
            dfs(grid, row - 1, j);
        }

        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(int[][] grid, int x, int y) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == 0) {
            return;
        }
        grid[x][y] = 0; // mark the cell as visited by setting it to 0
        dfs(grid, x + 1, y);
        dfs(grid, x - 1, y);
        dfs(grid, x, y + 1);
        dfs(grid, x, y - 1);
    }
}
