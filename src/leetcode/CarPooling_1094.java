/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * LeetCode 1094
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/02 16:29
 */
public class CarPooling_1094 {
    public boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips, (o1, o2) -> {
            if (o1[1] != o2[1]) {
                return o1[1] - o2[1];
            } else {
                return o1[2] - o2[2];
            }
        });

        int passengers = 0;
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
        for (int[] trip : trips) {
            int newPassengers = trip[0];
            int fromStop = trip[1];
            int toStop = trip[2];

            while (!queue.isEmpty() && queue.peek()[0] <= fromStop) {
                int[] dropOff = queue.poll();
                passengers -= dropOff[1];
            }
            passengers += newPassengers;
            if (passengers > capacity) {
                return false;
            }
            queue.offer(new int[]{toStop, newPassengers});
        }
        return true;
    }
}
