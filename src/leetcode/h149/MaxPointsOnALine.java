/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h149;

/**
 * LeetCode 149
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/28 10:04
 */
public class MaxPointsOnALine {
    public int maxPoints(int[][] points) {
        int xMax = Integer.MIN_VALUE;
        int yMax = Integer.MIN_VALUE;
        int xMin = Integer.MAX_VALUE;
        int yMin = Integer.MAX_VALUE;
        for (int[] point : points) {
            xMax = Math.max(xMax, point[0]);
            yMax = Math.max(yMax, point[1]);
            xMin = Math.min(xMin, point[0]);
            yMin = Math.min(yMin, point[1]);
        }

        int m = xMax - xMin + 1;
        int n = yMax - yMin + 1;
        int xShift = xMin == 0 ? 0 : -xMin;
        int yShift = yMin == 0 ? 0 : -yMin;
        boolean[][] map = new boolean[m][n];
        for (int[] point : points) {
            int x = point[0] + xShift;
            int y = point[1] + yShift;
            map[x][y] = true;
        }

        int res = 0;
        for (int i = 0; i < m; i++) {
            int candidate = 0;
            for (int j = 0; j < n; j++) {
                if (map[i][j]) {
                    candidate++;
                }
            }
            res = Math.max(res, candidate);
        }
        for (int j = 0; j < n; j++) {
            int candidate = 0;
            for (int i = 0; i < m; i++) {
                if (map[i][j]) {
                    candidate++;
                }
            }
            res = Math.max(res, candidate);
        }
        for (int j = 0; j < n; j++) {
            int x = 0;
            int y = j;
            int candidate = 0;
            while (x < m && y >= 0) {
                if (map[x][y]) {
                    candidate++;
                }
                x++;
                y--;
            }
            res = Math.max(res, candidate);
        }
        for (int j = 0; j < n; j++) {
            int x = 0;
            int y = j;
            int candidate = 0;
            while (x < m && y >= 0) {
                if (map[x][y]) {
                    candidate++;
                }
                x++;
                y--;
            }
            res = Math.max(res, candidate);
        }
        for (int j = n; j >= 0; j--) {
            int x = 0;
            int y = j;
            int candidate = 0;
            while (x < m && y < n) {
                if (map[x][y]) {
                    candidate++;
                }
                x++;
                y++;
            }
            res = Math.max(res, candidate);
        }
        return res;
    }
}
