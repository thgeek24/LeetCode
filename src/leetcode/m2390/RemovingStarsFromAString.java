/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m2390;

import java.util.Stack;

/**
 * LeetCode 2390
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/05 10:55
 */
public class RemovingStarsFromAString {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        stack.iterator().forEachRemaining(sb::append);
        return sb.toString();
    }
}
