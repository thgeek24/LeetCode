/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package interview.cmb;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem met during online test of CMB banking tech
 * Similar to LeetCode 435
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/07 20:43
 */
public class Problem1 {
    public boolean checkIntervalOverLap(ArrayList<Interval> intervals) {
        // write code here
        if (intervals.size() == 1) {
            return intervals.get(0).start < intervals.get(0).end;
        }
        List<Interval> sorted = intervals.stream().sorted((o1, o2) -> {
            if (o1.start != o2.start) {
                return o1.start - o2.start;
            } else {
                return o1.end - o2.end;
            }
        }).collect(Collectors.toList());

        for (int i = 0; i < sorted.size() - 1; i++) {
            Interval slow = sorted.get(i);
            Interval fast = sorted.get(i + 1);
            boolean noInterval = slow.start < slow.end && slow.end < fast.start && fast.start < fast.end;
            if (!noInterval) {
                return false;
            }
        }
        return true;
    }

    private static class Interval {
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
