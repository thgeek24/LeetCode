/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w424;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 3357
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/19 09:14
 */
public class MinimizeTheMaximumAdjacentElementDifference {
    public int minDifference(int[] nums) {
        List<Integer> indexes = new ArrayList<>();
        int prev = -1;
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (curr == -1) {
                indexes.add(i);
                continue;
            }
            if (prev != -1) {
                maxDiff = Math.max(maxDiff, Math.abs(prev - curr));
            }
            prev = curr;
        }


        return 0;
    }
}
