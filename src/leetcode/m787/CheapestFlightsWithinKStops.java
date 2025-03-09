/*
 * Copyright (c) 2024-2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m787;

import java.util.Arrays;

/**
 * LeetCode 787
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/26 15:11
 */
public class CheapestFlightsWithinKStops {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] cost = new int[n];
        Arrays.fill(cost, Integer.MAX_VALUE);
        cost[src] = 0;

        for (int i = 0; i <= k; i++) {
            int[] temp = Arrays.copyOf(cost, n);
            for (int[] flight : flights) {
                int u = flight[0];
                int v = flight[1];
                int w = flight[2];
                if (cost[u] != Integer.MAX_VALUE && temp[v] > cost[u] + w) {
                    temp[v] = cost[u] + w;
                }
            }
            cost = temp;
        }

        return cost[dst] == Integer.MAX_VALUE ? -1 : cost[dst];
    }
}
