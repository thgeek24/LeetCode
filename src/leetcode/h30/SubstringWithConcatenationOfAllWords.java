/*
 * Copyright (c) 2024-2025 THGEEK.COM. All rights reserved.
 */

package leetcode.h30;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * LeetCode 30
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/07 11:17
 */
public class SubstringWithConcatenationOfAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();

        int wordLength = words[0].length();
        int wordCount = words.length;

        // Create a frequency map of the words
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        // We only need to go through wordLength different starting points
        for (int i = 0; i < wordLength; i++) {
            int left = i;
            int right = i;
            int count = 0;
            Map<String, Integer> seenMap = new HashMap<>();

            while (right + wordLength <= s.length()) {
                // Get the next word from the right end
                String word = s.substring(right, right + wordLength);
                right += wordLength;

                if (wordMap.containsKey(word)) {
                    seenMap.put(word, seenMap.getOrDefault(word, 0) + 1);
                    count++;

                    // If there are more words than needed, slide the window
                    while (seenMap.get(word) > wordMap.get(word)) {
                        String leftWord = s.substring(left, left + wordLength);
                        seenMap.put(leftWord, seenMap.get(leftWord) - 1);
                        left += wordLength;
                        count--;
                    }

                    // If the window contains all the words, we found a valid start
                    if (count == wordCount) {
                        result.add(left);
                    }
                } else {
                    // Reset the window if the word is not in the word list
                    seenMap.clear();
                    count = 0;
                    left = right;
                }
            }
        }

        return result;
    }
}
