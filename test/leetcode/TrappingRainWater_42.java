/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 42
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/03 11:06
 */
public class TrappingRainWater_42 {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int trapped = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] > leftMax) {
                    leftMax = height[left];
                } else {
                    trapped += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] > rightMax) {
                    rightMax = height[right];
                } else {
                    trapped += rightMax - height[right];
                }
                right--;
            }
        }
        return trapped;
    }
}
