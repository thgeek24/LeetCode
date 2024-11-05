/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1466;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeSet;

/**
 * LeetCode 1466
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/05 19:54
 */
public class ReorderRoutesToMakeAllPathsLeadToTheCityZero {
    public int minReorder(int n, int[][] connections) {
        Map<Integer, TreeSet<Integer>> map = new HashMap<>();
        for (int[] conn : connections) {
            int index = conn[0];
            TreeSet<Integer> nextCities = map.getOrDefault(index, new TreeSet<>());
            nextCities.add(conn[1]);
            map.put(index, nextCities);
        }

        boolean[] connected = new boolean[n];
        connected[0] = true;
        int changes = 0;
        if (map.containsKey(0)) {
            Queue<Integer> queue = new LinkedList<>(map.get(0));
            while (!queue.isEmpty()) {
                int city = queue.poll();
                connected[city] = true;
                changes++;
                if (map.containsKey(city)) {
                    queue.addAll(map.get(city));
                }
            }
        }

        for (int i = 1; i < n; i++) {
            if (connected[i]) {
                continue;
            }
            if (!map.containsKey(i)) {
                continue;
            }
            TreeSet<Integer> nextCities = map.get(i);
            Integer first = nextCities.first();
            if (!connected[first]) {
                continue;
            }
            connected[i] = true;
            Queue<Integer> queue = new LinkedList<>(nextCities);
            while (!queue.isEmpty()) {
                int city = queue.poll();
                if (!connected[city]) {
                    connected[city] = true;
                    changes++;
                    if (map.containsKey(city)) {
                        queue.addAll(map.get(city));
                    }
                }
            }
        }

        return changes;
    }
}