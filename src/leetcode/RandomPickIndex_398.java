/*
 * Copyright (c) 2023 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.Random;

/**
 * LeetCode 398
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2023/12/28 17:55
 */
public class RandomPickIndex_398 {
    private final int[] nums;

    public RandomPickIndex_398(int[] nums) {
        this.nums = nums;
    }

    public int pick(int target) {
        Random random = new Random();
        int res = getFirstIndex(target);
        int i = 0;
        for (int j = res; j < nums.length; j++) {
            if (target == nums[j] && random.nextInt(++i) == 0) {
                res = j;
            }
        }
        return res;
    }

    private int getFirstIndex(int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
