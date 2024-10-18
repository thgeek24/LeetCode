/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h212;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 212
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/17 15:33
 */
public class WordSearchII {
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word;
    }

    private void insert(TrieNode root, String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null) {
                node.children[idx] = new TrieNode();
            }
            node = node.children[idx];
        }
        node.word = word;
    }

    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();
        TrieNode root = new TrieNode();

        // Build Trie for the words
        for (String word : words) {
            insert(root, word);
        }

        // DFS from each cell in the board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, i, j, root, result);
            }
        }

        return result;
    }

    private void dfs(char[][] board, int i, int j, TrieNode node, List<String> result) {
        char c = board[i][j];
        if (c == '#' || node.children[c - 'a'] == null) return;

        node = node.children[c - 'a'];
        if (node.word != null) {
            result.add(node.word);
            node.word = null; // Avoid duplicates
        }

        board[i][j] = '#'; // Mark as visited

        if (i > 0) dfs(board, i - 1, j, node, result);
        if (j > 0) dfs(board, i, j - 1, node, result);
        if (i < board.length - 1) dfs(board, i + 1, j, node, result);
        if (j < board[0].length - 1) dfs(board, i, j + 1, node, result);

        board[i][j] = c; // Unmark as visited
    }
}
