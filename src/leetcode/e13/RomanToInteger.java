/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e13;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 13
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/01/14 09:22
 */
public class RomanToInteger {
    private static final Map<Character, Integer> map;

    static {
        map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int romanToInt(String s) {
        int len = s.length();
        int sum = map.get(s.charAt(len - 1));
        int prev = map.get(s.charAt(len - 1));
        for (int i = len - 2; i >= 0; i--) {
            int curr = map.get(s.charAt(i));
            if (curr < prev) {
                sum -= curr;
            } else {
                sum += curr;
            }
            prev = curr;
        }
        return sum;
    }
}
