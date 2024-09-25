/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m151;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link ReverseWordsInAString}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/24 10:31
 */
class ReverseWordsInAStringTest {
    private ReverseWordsInAString test;

    @BeforeEach
    void setUp() {
        test = new ReverseWordsInAString();
    }

    @Test
    void test1() {
        String s = "the sky is blue";
        String expected = "blue is sky the";
        assertEquals(expected, test.reverseWords(s));
    }

    @Test
    void test2() {
        String s = "  hello world  ";
        String expected = "world hello";
        assertEquals(expected, test.reverseWords(s));
    }

    @Test
    void test3() {
        String s = "a good   example";
        String expected = "example good a";
        assertEquals(expected, test.reverseWords(s));
    }
}