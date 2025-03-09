/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package interview.cmb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Problem met during online test of CMB banking tech
 * Similar to LeetCode 1143
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/07 20:58
 */
public class Problem2 {
    // "hello word","hallo wood"
    // "llo wo"
    public String longestCommonStr(String str1, String str2) {
        if (str2.length() < str1.length()) {
            return longestCommonStr(str2, str1);
        }

        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            List<Integer> indexes = map.getOrDefault(str1.charAt(i), new ArrayList<>());
            indexes.add(i);
            map.put(str1.charAt(i), indexes);
        }

        int i = 0;
        int maxLen = 0;
        int left = Integer.MIN_VALUE;
        int right = Integer.MIN_VALUE;
        while (i < str2.length()) {
            char ch = str2.charAt(i);
            if (!map.containsKey(ch)) {
                i++;
                continue;
            }
            List<Integer> indexes = map.get(ch);
            for (Integer index : indexes) {
                int len = 0;
                // index in str1
                int m = index;
                // index in str2
                int n = i;
                while (m < str1.length() && n < str2.length() && str1.charAt(m) == str2.charAt(n)) {
                    len++;
                    m++;
                    n++;
                }
                if (len > maxLen) {
                    maxLen = len;
                    left = index;
                    right = m - 1;
                }
            }
            i++;
        }

        if (left == Integer.MIN_VALUE) {
            return "";
        } else {
            return str1.substring(left, right + 1);
        }
    }
}
