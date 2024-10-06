/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 1400
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/09 09:22
 */
public class ConstructKPalindromeStrings_1400 {
    public boolean canConstruct(String s, int k) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            count[index]++;
        }
        int pairCount = 0;
        int singleCount = 0;
        for (int i = 0; i < 26; i++) {
            pairCount += count[i] / 2;
            singleCount += count[i] % 2;
        }
        if (singleCount > k) {
            return false;
        } else {
            int diff = k - singleCount;
            return pairCount * 2 >= diff;
        }
    }
}
