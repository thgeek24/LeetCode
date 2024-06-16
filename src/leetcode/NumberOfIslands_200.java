/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 200
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/06/14 16:29
 */
public class NumberOfIslands_200 {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        boolean[][] visited = new boolean[row][col];

        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    count++;
                    dfs(i, j, grid, visited);
                }
            }
        }
        return count;
    }

    private void dfs(int row, int col, char[][] grid, boolean[][] visited) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || visited[row][col]) {
            return;
        }

        if (grid[row][col] == '1') {
            visited[row][col] = true;
            dfs(row + 1, col, grid, visited);
            dfs(row - 1, col, grid, visited);
            dfs(row, col + 1, grid, visited);
            dfs(row, col - 1, grid, visited);
        }
    }
}
