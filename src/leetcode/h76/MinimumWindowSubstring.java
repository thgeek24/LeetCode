/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h76;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 76
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/01 15:18
 */
public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            int cnt = charMap.getOrDefault(t.charAt(i), 0);
            charMap.put(t.charAt(i), cnt + 1);
        }

        int slow = 0;
        int fast = 0;
        int minLeft = slow;
        int minLen = Integer.MAX_VALUE;
        int remaining = t.length();
        while (fast < s.length()) {
            char char1 = s.charAt(fast);
            if (charMap.containsKey(char1)) {
                int fastCharCnt = charMap.get(char1);
                if (fastCharCnt > 0) {
                    remaining--;
                }
                charMap.put(char1, fastCharCnt - 1);
            }
            fast++;

            while (remaining == 0) {
                if (fast - slow < minLen) {
                    minLen = fast - slow;
                    minLeft = slow;
                }
                char char2 = s.charAt(slow);
                if (charMap.containsKey(char2)) {
                    int slowCharCnt = charMap.get(char2);
                    if (slowCharCnt >= 0) {
                        remaining++;
                    }
                    charMap.put(char2, slowCharCnt + 1);
                }
                slow++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
    }
}
