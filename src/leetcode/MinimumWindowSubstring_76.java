/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * LeetCode 76
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/01 15:18
 */
public class MinimumWindowSubstring_76 {
    public String minWindow(String s, String t) {
        Map<Character, Integer> targetMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            targetMap.put(t.charAt(i), targetMap.getOrDefault(t.charAt(i), 0) + 1);
        }

        int leftMost = 0;
        int right = 0;
        int minLen = Integer.MAX_VALUE;
        Map<Character, List<Integer>> charMap = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();
        while (right < s.length()) {
            char ch = s.charAt(right);
            if (targetMap.containsKey(ch)) {
                queue.add(ch);
                int targetCount = targetMap.get(ch);
                List<Integer> indexes = charMap.getOrDefault(ch, new ArrayList<>());
                indexes.add(right);
                charMap.put(ch, indexes);

                if (indexes.size() >= targetCount) {
                    while (true) {
                        Character deletingCh = queue.peek();
                        List<Integer> deletingIndexes = charMap.get(deletingCh);
                        if (deletingIndexes.size() > targetMap.get(deletingCh)) {
                            deletingIndexes.remove(0);
                            queue.poll();
                        } else {
                            leftMost = deletingIndexes.get(0);
                            minLen = Math.min(minLen, right - leftMost + 1);
                            break;
                        }
                    }
                }
            }
            right++;
        }
        if (minLen == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(leftMost, leftMost + minLen);
    }
}
