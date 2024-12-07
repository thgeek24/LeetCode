/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w424;

/**
 * LeetCode 3356
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/17 10:53
 */
public class ZeroArrayTransformationII {
    public int minZeroArray(int[] nums, int[][] queries) {
        int l = 0;
        int r = queries.length + 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (isZeroArray(nums, queries, mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l <= queries.length ? l : -1;
    }

    private boolean isZeroArray(int[] nums, int[][] queries, int k) {
        int[] line = new int[nums.length + 1];
        for (int i = 0; i < k; i++) {
            line[queries[i][0]] += queries[i][2];
            line[queries[i][1] + 1] -= queries[i][2];
        }

        int curr = 0;
        for (int i = 0; i < nums.length; i++) {
            curr += line[i];
            if (nums[i] > curr) {
                return false;
            }
        }
        return true;
    }
}
