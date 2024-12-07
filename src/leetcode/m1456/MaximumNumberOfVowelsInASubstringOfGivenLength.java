/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1456;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * LeetCode 1456
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/04 22:20
 */
public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    private final Set<Character> vowels = Stream.of('a', 'e', 'i', 'o', 'u').collect(Collectors.toSet());

    public int maxVowels(String s, int k) {
        int slow = 0;
        int fast = 0;

        int max = 0;
        int len = 0;
        while (fast < s.length()) {
            while (fast - slow < k && fast < s.length()) {
                if (vowels.contains(s.charAt(fast))) {
                    len++;
                }
                fast++;
            }
            max = Math.max(max, len);
            if (max == k) {
                return max;
            }
            if (vowels.contains(s.charAt(slow))) {
                len--;
            }
            slow++;
        }

        return max;
    }
}
