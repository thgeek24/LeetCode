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
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum == 0) {
            return 0;
        }

        int k = 0;
        for (int[] query : queries) {
            int l = query[0], r = query[1];
            for (int i = l; i <= r; i++) {
                int decrement = Math.min(nums[i], query[2]);
                nums[i] -= decrement;
                sum -= decrement;
            }
            k++;
            if (sum == 0) {
                return k;
            }
        }
        return -1;
    }
}
