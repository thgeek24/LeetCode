/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 189
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/29 11:04
 */
public class RotateArray_189 {
    public void rotate(int[] nums, int k) {
        if (k == 0 || nums.length == 1) {
            return;
        }

        int len = nums.length;
        int left = -k;
        int right = len - 1 - k;

        while (left < 0) {
            left += len;
        }
        while (right < 0) {
            right += len;
        }

        int[] res = new int[len];
        int index = 0;
        while (left < len) {
            res[index++] = nums[left++];
        }
        for (int j = 0; j <= right && index < len; j++) {
            res[index++] = nums[j];
        }
        System.arraycopy(res, 0, nums, 0, len);
    }
}
