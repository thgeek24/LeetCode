/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1926;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode 1926
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/06 09:45
 */
public class NearestExitFromEntranceInMaze {
    private final int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;
        boolean[][] visited = new boolean[m][n];
        visited[entrance[0]][entrance[1]] = true;

        int min = Integer.MAX_VALUE;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{entrance[0], entrance[1], 0});
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            for (int[] dir : directions) {
                int x = curr[0] + dir[0];
                int y = curr[1] + dir[1];
                if (isReachable(maze, visited, x, y)) {
                    if (isExit(m, n, x, y)) {
                        min = Math.min(min, curr[2] + 1);
                    } else {
                        queue.add(new int[]{x, y, curr[2] + 1});
                    }
                    visited[x][y] = true;
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    private boolean isReachable(char[][] maze, boolean[][] visited, int x, int y) {
        return x >= 0 && y >= 0 && x < maze.length && y < maze[0].length
                && maze[x][y] != '+' && !visited[x][y];
    }

    private boolean isExit(int m, int n, int x, int y) {
        return x == 0 || x == m - 1 || y == 0 || y == n - 1;
    }
}
