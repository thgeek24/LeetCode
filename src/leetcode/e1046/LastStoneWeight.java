/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.e1046;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * LeetCode 1046
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/15 11:18
 */
public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int stone : stones) {
            queue.offer(stone);
        }

        while (queue.size() > 1) {
            int first = queue.poll();
            int second = queue.poll();
            if (first == second) {
                continue;
            }
            queue.offer(first - second);
        }
        if (queue.isEmpty()) {
            return 0;
        }
        return queue.peek();
    }
}
