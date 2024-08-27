/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * LeetCode 205
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/27 16:41
 */
public class IsomorphicStrings_205 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (!sMap.containsKey(sChar) && !tMap.containsKey(tChar)) {
                sMap.put(sChar, i);
                tMap.put(tChar, i);
            } else if (sMap.containsKey(sChar) && tMap.containsKey(tChar)) {
                if (!Objects.equals(sMap.get(sChar), tMap.get(tChar))) {
                    return false;
                }
                sMap.put(sChar, i);
                tMap.put(tChar, i);
            } else {
                return false;
            }
        }
        return true;
    }
}
