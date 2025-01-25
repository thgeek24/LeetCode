/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link LongestPalindromicSubstring}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/01/25 10:55
 */
class LongestPalindromicSubstringTest {
    private LongestPalindromicSubstring test;

    @BeforeEach
    void setUp() {
        test = new LongestPalindromicSubstring();
    }

    @Test
    void test1() {
        String str = "babad";
        String expected = "bab";
        String actual = test.longestPalindrome(str);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        String str = "cbbd";
        String expected = "bb";
        String actual = test.longestPalindrome(str);
        assertEquals(expected, actual);
    }
}