/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m921;

import java.util.Stack;

/**
 * LeetCode 921
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/15 13:13
 */
public class MinimumAddToMakeParenthesesValid {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int res = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                res++;
            } else if (stack.peek() == '(') {
                stack.pop();
            } else {
                throw new IllegalArgumentException("not gonna happen");
            }
        }
        return res + stack.size();
    }
}
