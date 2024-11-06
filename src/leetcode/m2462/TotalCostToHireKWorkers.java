/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m2462;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * LeetCode 2462
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/06 14:21
 */
public class TotalCostToHireKWorkers {
    public long totalCost(int[] costs, int k, int candidates) {
        if (candidates * 2 >= costs.length) {
            int sum = 0;
            Arrays.sort(costs);
            for (int i = 0; i < k; i++) {
                sum += costs[i];
            }
            return sum;
        }

        int left = candidates - 1;
        int right = costs.length - candidates;
        Comparator<int[]> comparator = (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            } else {
                return o1[0] - o2[0];
            }
        };
        PriorityQueue<int[]> leftQueue = new PriorityQueue<>(comparator);
        PriorityQueue<int[]> rightQueue = new PriorityQueue<>(comparator);
        for (int i = 0; i <= left; i++) {
            leftQueue.add(new int[]{costs[i], i});
        }
        for (int i = right; i < costs.length; i++) {
            rightQueue.add(new int[]{costs[i], i});
        }
        long cost = 0;
        while (left < right && k > 0) {
            int[] worker1 = leftQueue.peek();
            int[] worker2 = rightQueue.peek();
            if (worker1[0] <= worker2[0]) {
                leftQueue.poll();
                cost += worker1[0];
                k--;
                left++;
                if (left == right) {
                    break;
                }
                leftQueue.offer(new int[]{costs[left], left});
            } else {
                rightQueue.poll();
                cost += worker2[0];
                k--;
                right--;
                if (left == right) {
                    break;
                }
                rightQueue.offer(new int[]{costs[right], right});
            }
        }
        if (k == 0) {
            return cost;
        }
        leftQueue.addAll(rightQueue);
        while (k > 0) {
            int[] worker = leftQueue.poll();
            cost += worker[0];
            k--;
        }
        return cost;
    }
}
