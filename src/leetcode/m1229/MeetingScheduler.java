/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1229;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * LeetCode 1229
 * <p>Hint: draw a draft to see different scenarios</p>
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/02 16:13
 */
public class MeetingScheduler {
    public List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {
        Arrays.sort(slots1, Comparator.comparingInt(o -> o[0]));
        Arrays.sort(slots2, Comparator.comparingInt(o -> o[0]));
        int i = 0;
        int j = 0;
        List<Integer> res = new ArrayList<>();
        while (i < slots1.length && j < slots2.length) {
            int overlap = lenOfOverlap(slots1[i], slots2[j]);
            if (overlap >= duration) {
                int start = Math.max(slots1[i][0], slots2[j][0]);
                int end = start + duration;
                res.add(start);
                res.add(end);
                return res;
            }
            if (slots1[i][1] < slots2[j][1]) {
                i++;
            } else {
                j++;
            }
        }
        return res;
    }

    private int lenOfOverlap(int[] slot1, int[] slot2) {
        int[] smaller;
        int[] larger;
        if (slot1[0] < slot2[0]) {
            smaller = slot1;
            larger = slot2;
        } else {
            smaller = slot2;
            larger = slot1;
        }
        int len = Math.min(smaller[1], larger[1]) - larger[0];
        return Math.max(len, 0);
    }
}
