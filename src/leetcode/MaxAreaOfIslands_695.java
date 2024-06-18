/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 695
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/06/18 15:48
 */
public class MaxAreaOfIslands_695 {
    private int max = 0;
    private int candidate = 0;

    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    candidate = 0;
                    dfs(i, j, grid, visited);
                    max = Math.max(candidate, max);
                }
            }
        }
        return max;
    }

    private void dfs(int i, int j, int[][] grid, boolean[][] visited) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || visited[i][j]) {
            return;
        }
        if (grid[i][j] == 1) {
            visited[i][j] = true;
            candidate++;
            dfs(i - 1, j, grid, visited);
            dfs(i + 1, j, grid, visited);
            dfs(i, j - 1, grid, visited);
            dfs(i, j + 1, grid, visited);
        }
    }
}
