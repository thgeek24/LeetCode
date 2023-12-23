/*
 * Copyright (c) 2023 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 268
 *
 * @author Tao
 * Hong
 * @version 1.0
 * @since 2023/12/23 17:15
 */
public class MissingNumber_268 {
    public int missingNumber(int[] nums) {
        int res = 0;
        int i = 1;
        for (int num : nums) {
            res ^= num ^ i++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        MissingNumber_268 test = new MissingNumber_268();
        int res = test.missingNumber(nums);
        System.out.println(res);
    }
}
