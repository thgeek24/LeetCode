/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m316;

import java.util.Stack;

/**
 * LeetCode 316
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/14 09:15
 */
public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        // Array to count the frequency of each character in the string
        int[] freq = new int[26];
        // Array to check if a character is already in the result
        boolean[] visited = new boolean[26];

        // Count the frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Stack to store the result characters
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // Decrease the frequency of the current character
            freq[c - 'a']--;

            // If the character is already in the result, skip it
            if (visited[c - 'a']) {
                continue;
            }

            // Ensure lexicographically smaller result:
            // Pop the stack if the current character is smaller than the top of the stack
            // and the top character still appears later in the string
            while (!stack.isEmpty() && c < stack.peek() && freq[stack.peek() - 'a'] > 0) {
                visited[stack.pop() - 'a'] = false;
            }

            // Push the current character onto the stack and mark it as visited
            stack.push(c);
            visited[c - 'a'] = true;
        }

        // Build the result string from the stack
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}
