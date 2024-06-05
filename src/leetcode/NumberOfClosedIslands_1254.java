/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 1254
 * <p>Hint: Clear all islands connected to boundaries, then explore islands withing the boundaries.
 * Every unvisited island contributes one to the result. Once you find one, explore it completely.
 * </p>
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/06/04 10:02
 */
public class NumberOfClosedIslands_1254 {
    public int closedIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];

        // visit islands on boundaries
        for (int i = 0; i < rows; i++) {
            dfs(i, 0, grid, visited);
            dfs(i, cols - 1, grid, visited);
        }
        for (int i = 1; i < cols - 1; i++) {
            dfs(0, i, grid, visited);
            dfs(rows - 1, i, grid, visited);
        }

        // visit unvisited islands within boundaries
        int result = 0;
        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                if (isUnvisitedIsland(i, j, grid, visited)) {
                    result++;
                }
                dfs(i, j, grid, visited);
            }
        }
        return result;
    }

    private boolean isUnvisitedIsland(int row, int col, int[][] grid, boolean[][] visited) {
        if (row == -1 || row == grid.length || col == -1 || col == grid[0].length) {
            return false;
        }
        if (visited[row][col]) {
            return false;
        }
        return grid[row][col] == 0;
    }

    private void dfs(int row, int col, int[][] grid, boolean[][] visited) {
        if (row == -1 || row == grid.length || col == -1 || col == grid[0].length || visited[row][col]) {
            return;
        }

        if (grid[row][col] == 0) {
            visited[row][col] = true;
            dfs(row - 1, col, grid, visited);
            dfs(row + 1, col, grid, visited);
            dfs(row, col + 1, grid, visited);
            dfs(row, col - 1, grid, visited);
        }
    }
}
