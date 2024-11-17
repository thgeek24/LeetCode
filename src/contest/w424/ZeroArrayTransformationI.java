/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w424;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/17 10:53
 */
public class ZeroArrayTransformationI {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n + 1];

        for (int[] query : queries) {
            int l = query[0], r = query[1];
            diff[l]--;
            if (r + 1 < n) {
                diff[r + 1]++;
            }
        }

        int current = 0;
        for (int i = 0; i < n; i++) {
            current += diff[i];
            nums[i] += current;
            if (nums[i] > 0) {
                return false;
            }
        }

        return true;
    }
}
