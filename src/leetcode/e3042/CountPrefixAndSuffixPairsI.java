/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e3042;

/**
 * LeetCode 3042
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/01/08 10:45
 */
public class CountPrefixAndSuffixPairsI {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isPrefixAndSuffix(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return false;
        }
        int prefixIndex = str2.indexOf(str1);
        int suffixIndex = str2.lastIndexOf(str1);
        return prefixIndex == 0 && suffixIndex == str2.length() - str1.length();
    }
}
