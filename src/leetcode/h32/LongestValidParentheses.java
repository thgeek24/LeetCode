/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h32;

import java.util.Stack;

/**
 * LeetCode 32
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/09 09:16
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        Stack<Character> charStack = new Stack<>();
        Stack<Integer> indexStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                charStack.push(c);
                indexStack.push(i);
                continue;
            }
            if (!charStack.isEmpty() && charStack.peek() == '(') {
                charStack.pop();
                indexStack.pop();
                continue;
            }
            charStack.push(c);
            indexStack.push(i);
        }

        if (indexStack.isEmpty()) {
            return s.length();
        }
        int longest = 0;
        int prev = -1;
        for (int curr : indexStack) {
            longest = Math.max(longest, curr - prev - 1);
            prev = curr;
        }
        longest = Math.max(longest, s.length() - prev - 1);
        return longest;
    }
}
