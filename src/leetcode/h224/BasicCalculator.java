/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h224;

import java.util.Objects;
import java.util.Stack;

/**
 * LeetCode 224
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/01 08:57
 */
public class BasicCalculator {
    public int calculate(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case ' ':
                    break;
                case '+':
                    pushIntString(sb, stack);
                    break;
                case '-':
                    pushIntString(sb, stack);
                    stack.push("-");
                    break;
                case '(':
                    pushIntString(sb, stack);
                    stack.push("(");
                    break;
                case ')':
                    pushIntString(sb, stack);
                    int sum = 0;
                    while (!Objects.equals(stack.peek(), "(")) {
                        int num = Integer.parseInt(stack.pop());
                        if (!stack.isEmpty() && Objects.equals(stack.peek(), "-")) {
                            stack.pop();
                            num *= -1;
                        }
                        sum += num;
                    }
                    stack.pop();
                    stack.push("" + sum);
                    break;
                default:
                    sb.append(ch);
                    break;
            }
        }
        pushIntString(sb, stack);
        int sum = 0;
        while (!stack.isEmpty()) {
            int num = Integer.parseInt(stack.pop());
            if (!stack.isEmpty() && Objects.equals(stack.peek(), "-")) {
                stack.pop();
                num *= -1;
            }
            sum += num;
        }
        return sum;
    }

    private void pushIntString(StringBuilder sb, Stack<String> stack) {
        if (sb.length() > 0) {
            stack.push(sb.toString());
            sb.setLength(0);
        }
    }
}
