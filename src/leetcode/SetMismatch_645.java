/*
 * Copyright (c) 2023 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.Arrays;

/**
 * LeetCode 645
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2023/12/25 11:26
 */
public class SetMismatch_645 {
    public int[] findErrorNums(int[] nums) {
        int dup = -1;
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]);
            if (nums[index - 1] < 0) {
                dup = index;
            } else {
                nums[index - 1] *= -1;
            }
        }

        int missing = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                missing = i + 1;
            }
        }
        return new int[]{dup, missing};
    }

    public static void main(String[] args) {
        int[] nums = {2, 2};
        SetMismatch_645 test = new SetMismatch_645();
        int[] res = test.findErrorNums(nums);
        System.out.println(Arrays.toString(res));
    }
}
