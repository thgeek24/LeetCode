/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 621
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/31 15:54
 */
public class TaskScheduler_621 {
    public int leastInterval(char[] tasks, int n) {
        if (n == 0) {
            return tasks.length;
        }

        int[] charCount = new int[26];
        for (char task : tasks) {
            int index = task - 'A';
            charCount[index]++;
        }

        final int groupSize = n + 1;
        int intervals = 0;
        int remaining = tasks.length;
        while (remaining > 0) {
            int completed = 0;
            for (int i = 0; i < 26; i++) {
                if (charCount[i] > 0) {
                    charCount[i]--;
                    remaining--;
                    completed++;
                    intervals++;
                    if (remaining == 0) {
                        return intervals;
                    }
                    if (completed == groupSize) {
                        break;
                    }
                }
            }
            intervals += groupSize - completed;
        }

        return intervals;
    }
}
