/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * LeetCode 621
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/31 15:54
 */
public class TaskScheduler_621 {
    private static class IndexCount {
        private int count;

        public IndexCount(int index, int count) {
            this.count = count;
        }
    }

    public int leastInterval(char[] tasks, int n) {
        if (n == 0) {
            return tasks.length;
        }

        int[] charCount = new int[26];
        for (char task : tasks) {
            int index = task - 'A';
            charCount[index]++;
        }
        PriorityQueue<IndexCount> queue = new PriorityQueue<>(((o1, o2) -> o2.count - o1.count));
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                queue.offer(new IndexCount(i, charCount[i]));
            }
        }

        final int groupSize = n + 1;
        int intervals = 0;
        int remaining = tasks.length;
        while (remaining > 0) {
            List<IndexCount> used = new ArrayList<>();
            while (used.size() < groupSize) {
                IndexCount item = queue.poll();
                if (item == null) {
                    break;
                }
                item.count--;
                remaining--;
                intervals++;
                used.add(item);
                if (remaining == 0) {
                    return intervals;
                }
            }

            intervals += groupSize - used.size();
            for (IndexCount item : used) {
                if (item.count > 0) {
                    queue.offer(item);
                }
            }
        }

        return intervals;
    }
}
