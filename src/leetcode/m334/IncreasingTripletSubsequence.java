/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m334;

/**
 * LeetCode 334
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/29 23:02
 */
public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                return true;
            }
        }
        return false;
    }
}
