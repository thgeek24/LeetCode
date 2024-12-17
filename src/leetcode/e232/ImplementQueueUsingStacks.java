/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.e232;

import java.util.Stack;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/14 16:10
 */
public class ImplementQueueUsingStacks {
    static class MyQueue {
        private final Stack<Integer> stack1;
        private final Stack<Integer> stack2;

        public MyQueue() {
            this.stack1 = new Stack<>();
            this.stack2 = new Stack<>();
        }

        public void push(int x) {
            stack1.push(x);
        }

        public int pop() {
            while (stack1.size() > 1) {
                stack2.push(stack1.pop());
            }
            int popped = stack1.pop();
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
            return popped;
        }

        public int peek() {
            while (stack1.size() > 1) {
                stack2.push(stack1.pop());
            }
            int top = stack1.peek();
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
            return top;
        }

        public boolean empty() {
            return stack1.isEmpty();
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
