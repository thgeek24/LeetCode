/*
 * Copyright (c) 2024-2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e290;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 290
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/27 12:38
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        Map<Character, Integer> patternMap = new HashMap<>();
        Map<String, Integer> wordMap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (!patternMap.containsKey(ch) && !wordMap.containsKey(word)) {
                patternMap.put(ch, i);
                wordMap.put(word, i);
            } else if (patternMap.containsKey(ch) && wordMap.containsKey(word)) {
                int chIndex = patternMap.get(ch);
                int wordIndex = wordMap.get(word);
                if (chIndex != wordIndex) {
                    return false;
                } else {
                    patternMap.put(ch, i);
                    wordMap.put(word, i);
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
