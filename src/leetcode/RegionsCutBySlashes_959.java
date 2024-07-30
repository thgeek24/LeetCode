/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 959
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/30 10:23
 */
public class RegionsCutBySlashes_959 {
    private int count = 0;
    private final int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int regionsBySlashes(String[] grid) {
        final int len = grid.length;
        int[][] matrix = new int[len + 1][len + 1];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                char c = grid[i].charAt(j);
                if (c == '/') {
                    matrix[i + 1][j] = 1;
                    matrix[i][j + 1] = 1;
                } else if (c == '\\') {
                    matrix[i][j] = 1;
                    matrix[i + 1][j + 1] = 1;
                }
            }
        }

        boolean[][] visited = new boolean[len + 1][len + 1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                visit(i, j, matrix, visited);
            }
        }
        return count;
    }

    private void visit(int i, int j, int[][] matrix, boolean[][] visited) {
        if (matrix[i][j] == 0 && !visited[i][j]) {
            count++;
            dfs(i, j, matrix, visited);
        }
    }

    private void dfs(int i, int j, int[][] matrix, boolean[][] visited) {
        if (i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length && matrix[i][j] == 0 && !visited[i][j]) {
            visited[i][j] = true;
            for (int[] direction : directions) {
                int x = i + direction[0];
                int y = j + direction[1];
                dfs(x, y, matrix, visited);
            }
        }
    }
}
