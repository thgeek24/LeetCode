/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.Stack;

/**
 * LeetCode 1130
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/13 20:50
 */
public class MinimumCostTreeFromLeafValues_1130 {
    public int mctFromLeafValues(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(Integer.MAX_VALUE);
        int cost = 0;

        for (int num : arr) {
            while (stack.peek() <= num) {
                int mid = stack.pop();
                cost += mid * Math.min(stack.peek(), num);
            }
            stack.push(num);
        }

        while (stack.size() > 2) {
            cost += stack.pop() * stack.peek();
        }

        return cost;
    }
}
