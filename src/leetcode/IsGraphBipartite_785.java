/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 785
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/14 23:15
 */
public class IsGraphBipartite_785 {
    public boolean isBipartite(int[][] graph) {
        int len = graph.length;
        int[] colors = new int[len];
        for (int i = 0; i < len; i++) {
            if (colors[i] == 0 && !dfs(i, 1, colors, graph)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(int node, int color, int[] colors, int[][] graph) {
        if (colors[node] != 0) {
            return colors[node] == color;
        }
        colors[node] = color;
        for (int neighbor : graph[node]) {
            if (!dfs(neighbor, -color, colors, graph)) {
                return false;
            }
        }
        return true;
    }
}
