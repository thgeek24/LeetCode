/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m443;

/**
 * LeetCode 443
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/01 08:10
 */
public class StringCompression {
    public int compress(char[] chars) {
        int slow = 0;
        int fast = 0;
        int len = 0;
        while (fast < chars.length) {
            while (fast < chars.length && chars[slow] == chars[fast]) {
                fast++;
            }
            chars[len] = chars[slow];
            len++;
            int count = fast - slow;
            if (count > 1) {
                char[] counts = Integer.toString(count).toCharArray();
                for (char c : counts) {
                    chars[len] = c;
                    len++;
                }
            }
            slow = fast;
        }
        return len;
    }
}
