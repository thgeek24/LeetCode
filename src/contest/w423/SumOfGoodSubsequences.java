/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w423;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode 3351
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/10 11:36
 */
public class SumOfGoodSubsequences {
    public int sumOfGoodSubsequences(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int res = 0;
        int MOD = 1000000007;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            queue.offer(new int[]{nums[i], nums[i], i});
            res = (res + nums[i]) % MOD;
        }
        while (!queue.isEmpty()) {
            int[] item = queue.poll();
            for (int i = item[2] + 1; i < nums.length; i++) {
                int abs = Math.abs(item[1] - nums[i]);
                if (abs == 1) {
                    int sum = item[0] + nums[i];
                    queue.offer(new int[]{sum, nums[i], i});
                    res = (res + sum) % MOD;
                }
            }
        }
        return res;
    }
}
