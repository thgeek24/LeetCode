/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m208;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode 208
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/15 10:31
 */
public class Trie {
    private final Set<String> wordSet;
    private final Set<String> prefixSet;

    public Trie() {
        this.wordSet = new HashSet<>();
        this.prefixSet = new HashSet<>();
    }

    public void insert(String word) {
        wordSet.add(word);
        for (int i = 0; i < word.length(); i++) {
            String prefix = word.substring(0, i + 1);
            prefixSet.add(prefix);
        }
    }

    public boolean search(String word) {
        return wordSet.contains(word);
    }

    public boolean startsWith(String prefix) {
        return prefixSet.contains(prefix);
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */