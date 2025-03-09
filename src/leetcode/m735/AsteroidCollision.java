/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m735;

import java.util.Stack;

/**
 * LeetCode 735
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/05 11:24
 */
public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int ast : asteroids) {
            if (stack.isEmpty() || (stack.peek() ^ ast) >= 0 || stack.peek() < 0 && ast > 0) {
                stack.push(ast);
                continue;
            }

            boolean pushed = false;
            while (!stack.isEmpty() && (stack.peek() ^ ast) < 0) {
                int former = stack.pop();
                int absFormer = Math.abs(former);
                int absAst = Math.abs(ast);
                if (absFormer == absAst) {
                    pushed = true;
                    break;
                }
                if (absFormer > absAst) {
                    pushed = true;
                    stack.push(former);
                    break;
                }
            }

            if (!pushed) {
                stack.push(ast);
            }
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
