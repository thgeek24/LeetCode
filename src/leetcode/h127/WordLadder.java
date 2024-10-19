/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h127;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * LeetCode 127
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/14 22:24
 */
public class WordLadder {
    private static class WordSeq {
        String word;
        int seq;

        WordSeq(String word, int seq) {
            this.word = word;
            this.seq = seq;
        }
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) {
            return 0;
        }

        Queue<WordSeq> queue = new LinkedList<>();
        queue.add(new WordSeq(beginWord, 1));
        while (!queue.isEmpty()) {
            WordSeq wordSeq = queue.poll();
            String word = wordSeq.word;
            int seq = wordSeq.seq;
            if (endWord.equals(word)) {
                return seq;
            }

            for (int i = 0; i < word.length(); i++) {
                char[] wordChars = word.toCharArray();
                for (char c = 'a'; c <= 'z'; c++) {
                    wordChars[i] = c;
                    String newWord = new String(wordChars);

                    if (wordSet.contains(newWord)) {
                        queue.add(new WordSeq(newWord, seq + 1));
                        wordSet.remove(newWord);
                    }
                }
            }
        }

        return 0;
    }
}
