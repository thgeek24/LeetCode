/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w425;

import java.util.List;

/**
 * LeetCode 3364
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/24 10:36
 */
public class MinimumPositiveSumSubarray {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minSum = Integer.MAX_VALUE;
        int size = nums.size();
        for (int i = 0; i <= size - l; i++) {
            int j = i;
            int sum = 0;
            while (j < i + l) {
                sum += nums.get(j);
                j++;
            }
            if (sum > 0) {
                minSum = Math.min(minSum, sum);
            }
            while (j < size && j < i + r) {
                sum += nums.get(j);
                if (sum > 0) {
                    minSum = Math.min(minSum, sum);
                }
                j++;
            }
        }
        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}
