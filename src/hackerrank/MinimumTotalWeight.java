/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package hackerrank;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * HackerRank 3 Minimum Total Weight
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/04 20:27
 */
public class MinimumTotalWeight {
    public int findMinWeight(int[] chocolates, int d) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int item : chocolates) {
            queue.add(item);
        }
        while (d > 0 && !queue.isEmpty()) {
            int chocolate = queue.poll();
            int eaten = (int) Math.floor((double) chocolate / 2);
            int remaining = chocolate - eaten;
            queue.offer(remaining);
            d--;
        }
        int res = 0;
        while (!queue.isEmpty()) {
            res += queue.poll();
        }
        return res;
    }
}
