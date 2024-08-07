/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode 30
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/07 11:17
 */
public class SubstringWithConcatenationOfAllWords_30 {
    public List<Integer> findSubstring(String s, String[] words) {
        final Map<String, Integer> finalWordStats = new HashMap<>();
        for (String word : words) {
            int count = finalWordStats.getOrDefault(word, 0);
            finalWordStats.put(word, count + 1);
        }

        int wordLen = words[0].length();
        int left = 0;
        int right = 0;
        int remaining = words.length;
        List<Integer> res = new ArrayList<>();

        Map<String, Integer> wordStats = new HashMap<>();
        recoverMap(wordStats, finalWordStats);

        while (right < s.length() && right + wordLen <= s.length()) {
            String rightWord = s.substring(right, right + wordLen);
            if (wordStats.containsKey(rightWord) && wordStats.get(rightWord) > 0) {
                wordStats.put(rightWord, wordStats.get(rightWord) - 1);
                remaining--;
                right += wordLen;
            } else if (wordStats.containsKey(rightWord)) {
                // recover wordStats & remaining
                wordStats.put(rightWord, wordStats.get(rightWord) - 1);
                // move right
                right += wordLen;
            } else {
                // recover wordStats & remaining
                recoverMap(wordStats, finalWordStats);
                remaining = words.length;
                // move right & left
                right++;
                left = right;
            }

            if (remaining == 0) {
                int maxLeft = right - wordLen * words.length;
                while (left < maxLeft) {
                    String leftWord = s.substring(left, left + wordLen);
                    if (wordStats.containsKey(leftWord) && wordStats.get(leftWord) >= 0) {
                        remaining++;
                    }
                    wordStats.put(leftWord, wordStats.get(leftWord) + 1);
                    left += wordLen;
                }
                if (remaining == 0) {
                    res.add(left);
                }
            }
        }
        return res;
    }

    private void recoverMap(Map<String, Integer> alteredMap, Map<String, Integer> originalMap) {
        alteredMap.putAll(originalMap);
    }
}
