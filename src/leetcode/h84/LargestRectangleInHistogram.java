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
        int max = 0;
        Stack<int[]> stack = new Stack<>();
        for (int height : heights) {
            if (stack.isEmpty()) {
                stack.push(new int[]{height, height});
                max = Math.max(height, max);
            } else if (height <= stack.peek()[0]) {
                int area = height;
                while (!stack.isEmpty() && height <= stack.peek()[0]) {
                    stack.pop();
                    area += height;
                }
                stack.push(new int[]{height, area});
                max = Math.max(area, max);
            } else {
                int area = stack.peek()[0] + stack.peek()[1];
                max = Math.max(area, max);
                stack.push(new int[]{height, area});
            }
        }

        if (stack.isEmpty()) {
            return 0;
        }
        return max;
    }
}
