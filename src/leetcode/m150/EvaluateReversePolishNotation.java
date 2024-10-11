/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m150;

import java.util.Stack;

/**
 * LeetCode 150
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/30 12:51
 */
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-": {
                    int latter = stack.pop();
                    int former = stack.pop();
                    stack.push(former - latter);
                    break;
                }
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/": {
                    int latter = stack.pop();
                    int former = stack.pop();
                    stack.push(former / latter);
                    break;
                }
                default:
                    stack.push(Integer.parseInt(token));
                    break;
            }
        }
        return stack.pop();
    }
}
