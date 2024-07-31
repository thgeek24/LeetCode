/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 1482
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/07/31 08:41
 */
public class MinimumNumberOfDaysToMakeMBouquets_1482 {
    public int minDays(int[] bloomDay, int m, int k) {
        long neededFlowers = bloomDay.length;
        if (neededFlowers < (long) m * k) {
            return -1;
        }

        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            left = Math.min(left, day);
            right = Math.max(right, day);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canMakeBouquets(mid, bloomDay, m, k)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean canMakeBouquets(int maxDay, int[] bloomDay, int m, int k) {
        int flowers = 0;
        int bouquets = 0;
        for (int day : bloomDay) {
            if (day <= maxDay) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                    if (bouquets == m) {
                        return true;
                    }
                }
            } else {
                flowers = 0;
            }
        }
        return false;
    }
}
