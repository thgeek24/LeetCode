/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m316;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link RemoveDuplicateLetters}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/14 09:20
 */
class RemoveDuplicateLettersTest {
    private RemoveDuplicateLetters test;

    @BeforeEach
    void setUp() {
        test = new RemoveDuplicateLetters();
    }

    @Test
    void test1() {
        String s = "bcabc";
        String actual = "abc";
        assertEquals(actual, test.removeDuplicateLetters(s));
    }

    @Test
    void test2() {
        String s = "cbacdcbc";
        String actual = "acdb";
        assertEquals(actual, test.removeDuplicateLetters(s));
    }
}