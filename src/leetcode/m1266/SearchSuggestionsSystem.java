/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1266;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * LeetCode 1268
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/06 22:54
 */
public class SearchSuggestionsSystem {
    private static class TrieNode {
        private final TrieNode[] children;
        private final PriorityQueue<String> suggestions;
        private boolean hasWord;

        public TrieNode() {
            this.children = new TrieNode[26];
            this.suggestions = new PriorityQueue<>();
            this.hasWord = false;
        }

        public void addWord(String word) {
            TrieNode cur = this;
            char[] charArray = word.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                char c = charArray[i];
                if (cur.children[c - 'a'] == null) {
                    cur.children[c - 'a'] = new TrieNode();
                }
                cur = cur.children[c - 'a'];
                cur.suggestions.add(word);
                if (cur.suggestions.size() > 3) {
                    List<String> _suggestions = new ArrayList<>();
                    while (_suggestions.size() < 3) {
                        _suggestions.add(cur.suggestions.poll());
                    }
                    cur.suggestions.clear();
                    cur.suggestions.addAll(_suggestions);
                }
                if (i == charArray.length - 1) {
                    cur.hasWord = true;
                }
            }
        }

        public List<String> getSuggestions(String word) {
            TrieNode cur = this;
            char[] charArray = word.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                char c = charArray[i];
                if (cur.children[c - 'a'] == null) {
                    return Collections.emptyList();
                }
                cur = cur.children[c - 'a'];
            }
            List<String> res = new ArrayList<>(cur.suggestions);
            Collections.sort(res);
            return res;
        }
    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        TrieNode trieNode = new TrieNode();
        for (String product : products) {
            trieNode.addWord(product);
        }
        List<List<String>> res = new ArrayList<>();
        for (int i = 0; i < searchWord.length(); i++) {
            String search = searchWord.substring(0, i + 1);
            res.add(trieNode.getSuggestions(search));
        }
        return res;
    }
}