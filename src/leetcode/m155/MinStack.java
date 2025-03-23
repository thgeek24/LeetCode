/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m155;

import java.util.Stack;

/**
 * LeetCode 155
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/04 09:24
 */
public class MinStack {
    private final Stack<Integer> stack;
    private final Stack<Integer> minStack;

    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val < minStack.peek()) {
            minStack.push(val);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
