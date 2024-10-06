/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m767;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link ReorganizeString}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/11 10:15
 */
class ReorganizeStringTest {
    private ReorganizeString test;

    @BeforeEach
    void setUp() {
        test = new ReorganizeString();
    }

    @Test
    void test1() {
        String expected = "aba";
        assertEquals(expected, test.reorganizeString("aab"));
    }

    @Test
    void test2() {
        String expected = "";
        assertEquals(expected, test.reorganizeString("aaab"));
    }

    @Test
    void test3() {
        String expected = "vlvov";
        assertEquals(expected, test.reorganizeString("vvvlo"));
    }

    @Test
    void test4() {
        String expected = "abacbc";
        assertEquals(expected, test.reorganizeString("aabbcc"));
    }
}