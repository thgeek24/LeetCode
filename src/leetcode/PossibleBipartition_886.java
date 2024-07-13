/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 886
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/13 17:30
 */
public class PossibleBipartition_886 {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] dislike : dislikes) {
            graph.get(dislike[0]).add(dislike[1]);
            graph.get(dislike[1]).add(dislike[0]);
        }

        int[] colors = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (colors[i] == 0 && !dfs(i, 1, colors, graph)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(int node, int color, int[] colors, List<List<Integer>> graph) {
        if (colors[node] != 0) {
            return colors[node] == color;
        }
        colors[node] = color;
        for (int neighbor : graph.get(node)) {
            if (!dfs(neighbor, -color, colors, graph)) {
                return false;
            }
        }
        return true;
    }
}
