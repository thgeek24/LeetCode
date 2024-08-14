/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 1283
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/03 13:35
 */
public class FindTheSmallestDivisorGivenAThreshold_1283 {
    public int smallestDivisor(int[] nums, int threshold) {
        long high = 0;
        for (int num : nums) {
            high += num;
        }
        long low = 1;
        while (low < high) {
            long mid = (low + high) / 2;
            long sum = calculate(nums, mid);
            if (sum > (long) threshold) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return (int) low;
    }

    private long calculate(int[] nums, long divisor) {
        long sum = 0;
        for (int num : nums) {
            sum += (long) Math.ceil((double) num / divisor);
        }
        return sum;
    }
}
