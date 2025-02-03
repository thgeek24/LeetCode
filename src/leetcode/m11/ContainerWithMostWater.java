/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m11;

/**
 * LeetCode 11
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/02/03 13:05
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0, j = height.length - 1; i < j; ) {
            int minHeight = height[i] < height[j] ? height[i++] : height[j--];
            max = Math.max(max, minHeight * (j - i + 1));
        }
        return max;
    }
}

