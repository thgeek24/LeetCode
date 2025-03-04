/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m155;

import java.util.PriorityQueue;
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
    private final PriorityQueue<Integer> queue;

    public MinStack() {
        this.stack = new Stack<>();
        this.queue = new PriorityQueue<>();
    }

    public void push(int val) {
        stack.push(val);
        queue.add(val);
    }

    public void pop() {
        Integer popped = stack.pop();
        queue.remove(popped);
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return queue.peek();
    }
}
