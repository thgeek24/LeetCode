/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 802
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/06/20 17:54
 */
public class FindEventualSafeStates_802 {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];  // 0 = unvisited, 1 = visiting, 2 = safe
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (dfs(i, color, graph)) {
                result.add(i);
            }
        }

        return result;
    }

    private boolean dfs(int node, int[] color, int[][] graph) {
        if (color[node] != 0) {
            return color[node] == 2;
        }

        color[node] = 1;  // Mark the node as visiting
        for (int next : graph[node]) {
            if (color[next] == 1 || !dfs(next, color, graph)) {
                return false;
            }
        }

        color[node] = 2;  // Mark the node as safe
        return true;
    }
}
