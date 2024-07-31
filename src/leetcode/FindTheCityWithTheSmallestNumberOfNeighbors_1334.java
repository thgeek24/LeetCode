/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.Arrays;

/**
 * LeetCode 1334
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/25 09:39
 */
public class FindTheCityWithTheSmallestNumberOfNeighbors_1334 {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dist = new int[n][n];
        final int INF = 10000000;
        for (int[] row : dist) {
            Arrays.fill(row, INF);
        }
        for (int i = 0; i < n; i++) {
            dist[i][i] = 0;
        }
        for (int[] edge : edges) {
            dist[edge[0]][edge[1]] = edge[2];
            dist[edge[1]][edge[0]] = edge[2];
        }

        // Floyd-Warshall algorithm
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        int res = -1;
        int minReachable = n;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (i != j && dist[i][j] <= distanceThreshold) {
                    count++;
                }
            }
            if (count <= minReachable) {
                minReachable = count;
                res = i;
            }
        }

        return res;
    }
}
