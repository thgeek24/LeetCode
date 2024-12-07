/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1657;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * LeetCode 1657
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/05 10:06
 */
public class DetermineIfTwoStringsAreClose {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : word1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : word2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        if (map1.size() != map2.size()
                || !map1.keySet().containsAll(map2.keySet())) {
            return false;
        }

        List<Integer> values1 = map1.values().stream().sorted().collect(Collectors.toList());
        List<Integer> values2 = map2.values().stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < values1.size(); i++) {
            if (!Objects.equals(values1.get(i), values2.get(i))) {
                return false;
            }
        }

        return true;
    }
}
