/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m151;

/**
 * LeetCode 151
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/24 10:28
 */
public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        int left = 0;
        int right = words.length - 1;
        while (left < right) {
            String word = words[left];
            words[left] = words[right];
            words[right] = word;
            left++;
            right--;
        }
        return String.join(" ", words);
    }
}
