/*
 * Copyright (c) 2024-2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m743;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * LeetCode 743
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/19 02:55
 */
public class NetworkDelayTime {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] timeSpent = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            timeSpent[i] = Integer.MAX_VALUE;
        }
        List<List<int[]>> timeSlots = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            timeSlots.add(new ArrayList<>());
        }
        for (int[] time : times) {
            timeSlots.get(time[0]).add(time);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(k);
        timeSpent[k] = 0;
        while (!queue.isEmpty()) {
            int slot = queue.poll();
            List<int[]> nextNodes = timeSlots.get(slot);
            nextNodes.forEach(nextNode -> {
                int nextSlot = nextNode[1];
                if (timeSpent[nextSlot] > timeSpent[slot] + nextNode[2]) {
                    timeSpent[nextSlot] = timeSpent[slot] + nextNode[2];
                    queue.add(nextSlot);
                }
            });
        }

        int res = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            res = Math.max(res, timeSpent[i]);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
