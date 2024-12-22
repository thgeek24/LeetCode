/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m55;

/**
 * LeetCode 55
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/22 10:58
 */
public interface JumpGame {
    boolean canJump(int[] nums);

    class Solution1 implements JumpGame {
        public boolean canJump(int[] nums) {
            int reachable = 0;
            for (int i = 0; i < nums.length && i <= reachable; i++) {
                reachable = Math.max(reachable, i + nums[i]);
                if (reachable >= nums.length - 1) return true;
            }
            return false;
        }
    }

    class Solution2 implements JumpGame {
        public boolean canJump(int[] nums) {
            if (nums.length == 1) {
                return true;
            }
            int max = nums[0];
            int i = 1;
            while (i < nums.length) {
                if (max >= nums.length - 1) {
                    return true;
                }
                int temp = max;
                for (int j = i; j <= temp; j++) {
                    max = Math.max(max, j + nums[j]);
                }
                if (max == temp) {
                    return false;
                }
                i = temp + 1;
            }
            return true;
        }
    }

}
