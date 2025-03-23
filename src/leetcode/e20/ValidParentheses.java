/*
 * Copyright (c) 2023-2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e20;

import java.util.Stack;

/**
 * LeetCode 20
 *
 * @author Tao Hong
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> parenStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!parenStack.empty()) {
                if ((parenStack.peek() == '(' && s.charAt(i) == ')') ||
                        (parenStack.peek() == '[' && s.charAt(i) == ']') || (parenStack.peek() == '{' && s.charAt(i) == '}')) {
                    parenStack.pop();
                } else {
                    parenStack.push(s.charAt(i));
                }
            } else {
                parenStack.push(s.charAt(i));
            }
        }
        return (parenStack.empty());
    }
}
