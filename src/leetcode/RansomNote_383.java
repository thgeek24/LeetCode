/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 383
 * Level: Easy
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/07 21:46
 */
public class RansomNote_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);

            if (!map.containsKey(c)) {
                return false;
            }

            if (map.get(c) <= 0) {
                return false;
            }

            map.put(c, map.get(c) - 1);
        }
        return true;
    }
}
