/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 1011
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/06 15:06
 */
public class CapacityToShipPackagesWithinDDays_1011 {
    public int shipWithinDays(int[] weights, int days) {
        int total = 0;
        int max = Integer.MIN_VALUE;
        for (int weight : weights) {
            total += weight;
            max = Math.max(max, weight);
        }

        int low = max;
        int high = total;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canFinish(weights, mid, days)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canFinish(int[] weights, int capacity, int days) {
        int actualDays = 0;
        int load = 0;
        for (int weight : weights) {
            if (actualDays > days) {
                return false;
            }

            int tempLoad = load + weight;
            if (tempLoad < capacity) {
                load = tempLoad;
            } else if (tempLoad == capacity) {
                actualDays++;
                load = 0;
            } else {
                actualDays++;
                load = weight;
            }
        }
        if (load != 0) {
            actualDays++;
        }
        return actualDays <= days;
    }
}
