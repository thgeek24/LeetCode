/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m2462;

import java.util.Arrays;
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
        PriorityQueue<Integer> leftQueue = new PriorityQueue<>();
        PriorityQueue<Integer> rightQueue = new PriorityQueue<>();
        for (int i = 0; i <= left; i++) {
            leftQueue.add(costs[i]);
        }
        for (int i = right; i < costs.length; i++) {
            rightQueue.add(costs[i]);
        }
        long cost = 0;
        while (left < right && k > 0) {
            int worker1 = leftQueue.peek();
            int worker2 = rightQueue.peek();
            if (worker1 <= worker2) {
                leftQueue.poll();
                cost += worker1;
                k--;
                left++;
                if (left == right) {
                    break;
                }
                leftQueue.offer(costs[left]);
            } else {
                rightQueue.poll();
                cost += worker2;
                k--;
                right--;
                if (left == right) {
                    break;
                }
                rightQueue.offer(costs[right]);
            }
        }
        if (k == 0) {
            return cost;
        }
        leftQueue.addAll(rightQueue);
        while (k > 0) {
            cost += leftQueue.poll();
            k--;
        }
        return cost;
    }
}
