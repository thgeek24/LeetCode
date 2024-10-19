/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h212;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for {@link WordSearchII}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/17 15:37
 */
class WordSearchIITest {
    private WordSearchII test;

    @BeforeEach
    void setUp() {
        test = new WordSearchII();
    }

    @Test
    void test1() {
        char[][] board = {{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}};
        String[] words = {"oath", "pea", "eat", "rain"};
        List<String> expected = Arrays.asList("eat", "oath");
        List<String> actual = test.findWords(board, words);
        assertTrue(expected.size() == actual.size() && expected.containsAll(actual));
    }

    @Test
    void test2() {
        char[][] board = {{'a', 'b'}, {'c', 'd'}};
        String[] words = {"abcb"};
        List<String> expected = Collections.emptyList();
        List<String> actual = test.findWords(board, words);
        assertTrue(actual.isEmpty() && expected.containsAll(actual));
    }

    @Test
    void test3() {
        char[][] board = {{'a'}};
        String[] words = {"ab"};
        List<String> expected = Collections.emptyList();
        List<String> actual = test.findWords(board, words);
        assertTrue(actual.isEmpty() && expected.containsAll(actual));
    }

    @Test
    void test4() {
        char[][] board = {{'a', 'b'}};
        String[] words = {"ba"};
        List<String> expected = Collections.singletonList("ba");
        List<String> actual = test.findWords(board, words);
        assertTrue(expected.size() == actual.size() && expected.containsAll(actual));
    }

    @Test
    void test5() {
        char[][] board = {{'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'}};
        String[] words = {"a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa"};
        List<String> expected = Arrays.asList("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa");
        List<String> actual = test.findWords(board, words);
        assertTrue(expected.size() == actual.size() && expected.containsAll(actual));
    }
}