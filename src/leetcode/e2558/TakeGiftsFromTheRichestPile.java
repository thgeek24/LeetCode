/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.e2558;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * LeetCode 2558
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/12 08:59
 */
public class TakeGiftsFromTheRichestPile {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int gift : gifts) {
            queue.add(gift);
        }
        while (k-- > 0) {
            int gift = queue.poll();
            int remaining = (int) Math.floor(Math.sqrt(gift));
            queue.offer(remaining);
        }
        long res = 0;
        while (!queue.isEmpty()) {
            res += queue.poll();
        }
        return res;
    }
}
