/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1081;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link SmallestSubsequenceOfDistinctCharacters}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/14 13:19
 */
class SmallestSubsequenceOfDistinctCharactersTest {
    private SmallestSubsequenceOfDistinctCharacters test;

    @BeforeEach
    void setUp() {
        test = new SmallestSubsequenceOfDistinctCharacters();
    }

    @Test
    void test1() {
        String s = "bcabc";
        String actual = "abc";
        assertEquals(actual, test.smallestSubsequence(s));
    }

    @Test
    void test2() {
        String s = "cbacdcbc";
        String actual = "acdb";
        assertEquals(actual, test.smallestSubsequence(s));
    }

}