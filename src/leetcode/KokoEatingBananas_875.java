/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 875
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/05 14:46
 */
public class KokoEatingBananas_875 {
    public int minEatingSpeed(int[] piles, int h) {
        int high = Integer.MIN_VALUE;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        int low = 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canFinish(piles, mid, h)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canFinish(int[] piles, int eatingSpeed, int h) {
        int hours = 0;
        for (int pile : piles) {
            hours += (int) Math.ceil((double) pile / eatingSpeed);
            if (hours > h) {
                return false;
            }
        }
        return true;
    }
}
