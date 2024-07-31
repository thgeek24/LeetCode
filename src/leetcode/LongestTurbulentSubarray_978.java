/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 978
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/28 10:30
 */
public class LongestTurbulentSubarray_978 {
    public int maxTurbulenceSize(int[] arr) {
        if (arr.length == 1) {
            return 1;
        }
        int left = 0;
        int right = 1;
        int longest = 2;
        int sign = 0;
        if (arr[left] > arr[right]) {
            sign = 1;
        } else if (arr[left] < arr[right]) {
            sign = -1;
        } else {
            longest = 1;
            left = right;
        }

        while (right < arr.length - 1) {
            int tempSign = 0;
            int tempRight = right + 1;
            if (arr[right] > arr[right + 1]) {
                tempSign = 1;
            } else if (arr[right] < arr[right + 1]) {
                tempSign = -1;
            }

            int comparison = sign * tempSign;
            if (comparison < 0) {
                sign = tempSign;
                longest = Math.max(longest, tempRight - left + 1);
            } else if (comparison > 0) {
                left = right;
            } else if (tempSign != 0) {
                sign = tempSign;
                longest = Math.max(longest, tempRight - left + 1);
            } else {
                sign = tempSign;
                left = tempRight;
            }

            right = tempRight;
        }
        return longest;
    }
}
