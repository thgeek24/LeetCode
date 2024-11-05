/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m394;

import java.util.Stack;

/**
 * LeetCode 394
 * <p>
 *     Hint: 遇到']'先出栈直到去除一个'['，然后再去除数字，然后将得到字符再压入栈
 * </p>
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/05 12:30
 */
public class DecodeString {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == ']') {
                StringBuilder charBuilder = new StringBuilder();
                while (stack.peek() != '[') {
                    charBuilder.append(stack.pop());
                }
                charBuilder.reverse();
                stack.pop();

                StringBuilder intBuilder = new StringBuilder();
                while (!stack.isEmpty() && isDigit(stack.peek())) {
                    intBuilder.append(stack.pop());
                }
                intBuilder.reverse();
                int count = intBuilder.length() == 0 ? 1 : Integer.parseInt(intBuilder.toString());

                while (count > 0) {
                    for (int i = 0; i < charBuilder.length(); i++) {
                        stack.push(charBuilder.charAt(i));
                    }
                    count--;
                }
            } else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        stack.forEach(sb::append);
        return sb.toString();
    }

    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }
}
