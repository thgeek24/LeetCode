/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h127;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link WordLadder}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/14 22:25
 */
class WordLadderTest {
    private WordLadder test;

    @BeforeEach
    void setUp() {
        test = new WordLadder();
    }

    @Test
    void equalsFive() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        int expected = 5;
        assertEquals(expected, test.ladderLength(beginWord, endWord, wordList));
    }

    @Test
    void equalsZero() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log");
        int expected = 0;
        assertEquals(expected, test.ladderLength(beginWord, endWord, wordList));
    }
}