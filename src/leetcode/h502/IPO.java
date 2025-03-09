/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h502;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * LeetCode 502
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/23 20:33
 */
public class IPO {
    private static class Capital {
        int capital;
        int profit;

        public Capital(int capital, int profit) {
            this.capital = capital;
            this.profit = profit;
        }
    }

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<Capital> queue = new PriorityQueue<>(compareCapital());
        for (int i = 0; i < profits.length; i++) {
            int c = capital[i];
            int p = profits[i];
            queue.offer(new Capital(c, p));
        }

        int res = w;
        List<Capital> skipped = new ArrayList<>();
        while (!queue.isEmpty() && k > 0) {
            while (!queue.isEmpty() && queue.peek().capital > res) {
                skipped.add(queue.poll());
            }
            if (queue.isEmpty()) {
                break;
            }
            Capital c = queue.poll();
            res += c.profit;
            queue.addAll(skipped);
            skipped.clear();
            k--;
        }
        return res;
    }

    private Comparator<Capital> compareCapital() {
        return (o1, o2) -> {
            if (o1.profit == o2.profit) {
                return o1.capital - o2.capital;
            }
            return o2.profit - o1.profit;
        };
    }
}
