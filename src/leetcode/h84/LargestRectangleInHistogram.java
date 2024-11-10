/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h84;

import java.util.Stack;

/**
 * LeetCode 84
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/10 00:31
 */
public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= heights.length; i++) {
            int h = (i == heights.length) ? 0 : heights[i];

            while (!stack.isEmpty() && h < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        return maxArea;
    }
}
