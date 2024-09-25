/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/27 14:00
 */
class WordPattern_290Test {
    private WordPattern_290 test;

    @BeforeEach
    void setUp() {
        test = new WordPattern_290();
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