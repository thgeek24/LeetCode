/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m211;

/**
 * LeetCode 211
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/16 09:48
 */
public class DesignAddAndSearchWordsDataStructure {
    private static class TrieNode {
        private final TrieNode[] children;
        private boolean isEnd;

        public TrieNode() {
            this.children = new TrieNode[26];
            // 表明有单词结束在此
            this.isEnd = false;
        }

        public void addWord(String word) {
            char[] wordChars = word.toCharArray();
            TrieNode cur = this;
            for (char c : wordChars) {
                if (cur.children[c - 'a'] == null) {
                    cur.children[c - 'a'] = new TrieNode();
                }
                cur = cur.children[c - 'a'];
            }
            cur.isEnd = true;
        }

        public boolean search(String word) {
            char[] wordChars = word.toCharArray();
            return search(wordChars, 0, this);
        }

        private boolean search(char[] wordChars, int index, TrieNode cur) {
            if (cur == null || index >= wordChars.length) {
                return false;
            }

            char c = wordChars[index];
            if (c == '.') {
                for (int i = 0; i < cur.children.length; i++) {
                    TrieNode child = cur.children[i];
                    if (index == wordChars.length - 1 && child != null && child.isEnd) {
                        return true;
                    }
                    if (search(wordChars, index + 1, child)) {
                        return true;
                    }
                }
                return false;
            }

            if (cur.children[c - 'a'] == null) {
                return false;
            }
            cur = cur.children[c - 'a'];
            if (index == wordChars.length - 1) {
                return cur.isEnd;
            }
            return search(wordChars, index + 1, cur);
        }
    }

    public static class WordDictionary {
        private final TrieNode root;

        public WordDictionary() {
            this.root = new TrieNode();
        }

        public void addWord(String word) {
            root.addWord(word);
        }

        public boolean search(String word) {
            return root.search(word);
        }
    }
}
