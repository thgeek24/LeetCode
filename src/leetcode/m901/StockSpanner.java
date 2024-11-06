/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m901;

import java.util.Stack;

/**
 * LeetCode 901
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/07 00:29
 */
public class StockSpanner {
    private final Stack<int[]> stack;

    public StockSpanner() {
        // Stack stores pairs of [price, span]
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1; // Start with span of 1 (counting today)

        // While stack is not empty and current price is greater than or equal to
        // the price on top of stack, pop and add the span
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }

        // Add current price and its span to stack
        stack.push(new int[]{price, span});
        return span;
    }
}