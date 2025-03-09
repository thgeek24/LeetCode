/*
 * Copyright (c) 2024-2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e290;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/27 14:00
 */
class WordPatternTest {
    private WordPattern test;

    @BeforeEach
    void setUp() {
        test = new WordPattern();
    }

    @Test
    void test1() {
        String pattern = "abba";
        String s = "dog cat cat dog";
        assertTrue(test.wordPattern(pattern, s));
    }

    @Test
    void test2() {
        String pattern = "abba";
        String s = "dog cat cat fish";
        assertFalse(test.wordPattern(pattern, s));
    }

    @Test
    void test3() {
        String pattern = "aaaa";
        String s = "dog cat cat dog";
        assertFalse(test.wordPattern(pattern, s));
    }

    @Test
    void test4() {
        String pattern = "aa";
        String s = "dog dog dog dog";
        assertFalse(test.wordPattern(pattern, s));
    }
}