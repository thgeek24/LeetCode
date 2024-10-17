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
    private final int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private int m;
    private int n;
    private boolean[][] visited;
    private TrieNode root;

    public List<String> findWords(char[][] board, String[] words) {
        init(board);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                StringBuilder sb = new StringBuilder();
                visit(i, j, visited, board, sb);
            }
        }

        List<String> res = new ArrayList<>();
        for (String word : words) {
            if (root.search(word)) {
                res.add(word);
            }
        }
        return res;
    }

    private void init(char[][] board) {
        m = board.length;
        n = board[0].length;
        visited = new boolean[m][n];
        root = new TrieNode();
    }

    private void visit(int x, int y, boolean[][] visited, char[][] board, StringBuilder sb) {
        if (reachable(x, y, board.length, board[0].length) && !visited[x][y]) {
            sb.append(board[x][y]);
            visited[x][y] = true;

            boolean isEnd = true;
            for (int[] dir : directions) {
                int i = x + dir[0];
                int j = y + dir[1];
                if (reachable(i, j, board.length, board[0].length) && !visited[i][j]) {
                    isEnd = false;
                    visit(i, j, visited, board, sb);
                }
            }
            if (isEnd) {
                root.addWord(sb.toString());
            }
            sb.deleteCharAt(sb.length() - 1);
            visited[x][y] = false;
        }
    }

    private boolean reachable(int i, int j, int m, int n) {
        return i >= 0 && j >= 0 && i < m && j < n;
    }

    private static class TrieNode {
        private final TrieNode[] children;

        public TrieNode() {
            this.children = new TrieNode[26];
        }

        public void addWord(String word) {
            TrieNode cur = this;
            char[] wordChars = word.toCharArray();
            for (char ch : wordChars) {
                if (cur.children[ch - 'a'] == null) {
                    cur.children[ch - 'a'] = new TrieNode();
                }
                cur = cur.children[ch - 'a'];
            }
        }

        public boolean search(String word) {
            TrieNode cur = this;
            char[] wordChars = word.toCharArray();
            for (char ch : wordChars) {
                if (cur.children[ch - 'a'] == null) {
                    return false;
                }
                cur = cur.children[ch - 'a'];
            }
            return true;
        }
    }
}
