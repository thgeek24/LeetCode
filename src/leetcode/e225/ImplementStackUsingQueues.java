/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.e225;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode 225
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/14 15:54
 */
public class ImplementStackUsingQueues {
    static class MyStack {
        private Queue<Integer> queue1;
        private Queue<Integer> queue2;

        public MyStack() {
            this.queue1 = new LinkedList<>();
            this.queue2 = new LinkedList<>();
        }

        public void push(int x) {
            this.queue1.add(x);
        }

        public int pop() {
            while (queue1.size() > 1) {
                queue2.add(queue1.poll());
            }
            int popped = queue1.poll();
            Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;
            return popped;
        }

        public int top() {
            while (queue1.size() > 1) {
                queue2.add(queue1.poll());
            }
            int top = queue1.peek();
            queue2.add(queue1.poll());
            Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;
            return top;
        }

        public boolean empty() {
            return queue1.isEmpty();
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
