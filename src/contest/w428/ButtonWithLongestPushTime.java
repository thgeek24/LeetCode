/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w428;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/15 10:31
 */
public class ButtonWithLongestPushTime {
    public int buttonWithLongestTime(int[][] events) {
        if (events.length == 1) {
            return events[0][0];
        }

        int[] times = new int[100001];
        int prevTime = 0;
        for (int[] event : events) {
            int timeSpent = event[1] - prevTime;
            times[event[0]] = Math.max(times[event[0]], timeSpent);
            prevTime = event[1];
        }

        int button = 0;
        int longest = Integer.MIN_VALUE;
        for (int i = 1; i < times.length; i++) {
            if (times[i] > longest) {
                longest = times[i];
                button = i;
            }
        }
        return button;
    }
}
