/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m394;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link DecodeString}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/05 12:33
 */
class DecodeStringTest {
    private DecodeString test;

    @BeforeEach
    void setUp() {
        test = new DecodeString();
    }

    @Test
    void test1() {
        String s = "3[a]2[bc]";
        String expected = "aaabcbc";
        assertEquals(expected, test.decodeString(s));
    }

    @Test
    void test2() {
        String s = "3[a2[c]]";
        String expected = "accaccacc";
        assertEquals(expected, test.decodeString(s));
    }

    @Test
    void test3() {
        String s = "2[abc]3[cd]ef";
        String expected = "abcabccdcdcdef";
        assertEquals(expected, test.decodeString(s));
    }
}