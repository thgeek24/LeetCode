/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m3;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode 3
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/02/07 16:58
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int slow = 0;
        int fast = 0;
        int res = 0;
        Set<Character> set = new HashSet<>();
        while (fast < s.length()) {
            char ch = s.charAt(fast);
            if (!set.contains(ch)) {
                set.add(ch);
                fast++;
                res = Math.max(res, fast - slow);
                continue;
            }

            while (set.contains(ch)) {
                set.remove(s.charAt(slow));
                slow++;
            }
            set.add(ch);
            fast++;
        }

        return res;
    }
}
