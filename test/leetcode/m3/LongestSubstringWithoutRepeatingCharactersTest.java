/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link LongestSubstringWithoutRepeatingCharacters}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/02/07 16:59
 */
class LongestSubstringWithoutRepeatingCharactersTest {
    private LongestSubstringWithoutRepeatingCharacters test;

    @BeforeEach
    void setUp() {
        test = new LongestSubstringWithoutRepeatingCharacters();
    }

    @Test
    void test1() {
        String s = "abcabcbb";
        int expected = 3;
        assertEquals(expected, test.lengthOfLongestSubstring(s));
    }

    @Test
    void test2() {
        String s = "bbbbb";
        int expected = 1;
        assertEquals(expected, test.lengthOfLongestSubstring(s));
    }

    @Test
    void test3() {
        String s = "pwwkew";
        int expected = 3;
        assertEquals(expected, test.lengthOfLongestSubstring(s));
    }
}