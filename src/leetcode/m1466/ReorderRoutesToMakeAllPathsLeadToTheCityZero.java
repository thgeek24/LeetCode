/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1466;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * LeetCode 1466
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/05 19:54
 */
public class ReorderRoutesToMakeAllPathsLeadToTheCityZero {
    public int minReorder(int n, int[][] connections) {
        // Graph representation using adjacency lists
        List<List<Integer>> graph = new ArrayList<>();
        Set<String> directedEdges = new HashSet<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Build the graph with directed edges and mark the original direction
        for (int[] connection : connections) {
            int from = connection[0];
            int to = connection[1];
            graph.get(from).add(to);
            graph.get(to).add(from);
            directedEdges.add(from + "," + to); // Marking original direction
        }

        // Start BFS traversal from node 0
        int reorderCount = 0;
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];

        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int neighbor : graph.get(current)) {
                if (!visited[neighbor]) {
                    // Check if edge needs to be reordered
                    if (directedEdges.contains(current + "," + neighbor)) {
                        reorderCount++;
                    }
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }

        return reorderCount;
    }
}