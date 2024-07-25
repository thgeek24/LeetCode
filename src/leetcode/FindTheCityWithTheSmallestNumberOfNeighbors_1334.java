/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * LeetCode 1334
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/25 09:39
 */
public class FindTheCityWithTheSmallestNumberOfNeighbors_1334 {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] distances = new int[n][n];
        List<Set<Integer>> neighbors = new ArrayList<>();
        for (int[] distance : distances) {
            for (int i = 0; i < n; i++) {
                distance[i] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < n; i++) {
            neighbors.add(new HashSet<>());
        }

        for (int[] edge : edges) {
            int weight = edge[2];
            if (weight > distanceThreshold) {
                continue;
            }

            int from = edge[0];
            int to = edge[1];
            boolean updated = false;
            if (distances[from][to] > weight) {
                distances[from][to] = weight;
                distances[to][from] = weight;
                neighbors.get(from).add(to);
                neighbors.get(to).add(from);
                updated = true;
            }

            if (updated) {
                for (int i = 0; i < from; i++) {
                    int newWeight = distances[i][from] + weight;
                    if (newWeight > distanceThreshold) {
                        continue;
                    }
                    if (distances[i][from] != Integer.MAX_VALUE && distances[i][to] > newWeight) {
                        distances[i][to] = newWeight;
                        distances[to][i] = newWeight;
                        neighbors.get(i).add(to);
                        neighbors.get(to).add(i);
                    }
                }
            }
        }

        int res = -1;
        int minNeighborCnt = Integer.MAX_VALUE;
        for (int i = 0; i < neighbors.size(); i++) {
            if (neighbors.get(i).size() <= minNeighborCnt) {
                minNeighborCnt = neighbors.get(i).size();
                res = Math.max(i, res);
            }
        }

        return res;
    }
}
