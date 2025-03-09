/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1081;

import java.util.Stack;

/**
 * LeetCode 1081
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/14 13:16
 */
public class SmallestSubsequenceOfDistinctCharacters {
    public String smallestSubsequence(String s) {
        int[] freq = new int[26];
        boolean[] visited = new boolean[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            freq[c - 'a']--;

            if (visited[c - 'a']) {
                continue;
            }

            while (!stack.isEmpty() && stack.peek() > c && freq[stack.peek() - 'a'] > 0) {
                visited[stack.pop() - 'a'] = false;
            }

            stack.push(c);
            visited[c - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}
