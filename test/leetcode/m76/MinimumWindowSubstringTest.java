/*
 * Copyright (c) 2024-2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m76;

import leetcode.h76.MinimumWindowSubstring;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Test for {@link MinimumWindowSubstring}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/01 15:43
 */
class MinimumWindowSubstringTest {
    private MinimumWindowSubstring test;

    @BeforeEach
    void setUp() {
        test = new MinimumWindowSubstring();
    }

    @Test
    void equalsBANC() {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String actual = test.minWindow(s, t);
        assertEquals("BANC", actual);
    }

    @Test
    void equalsA() {
        String s = "a";
        String t = "a";
        String actual = test.minWindow(s, t);
        assertEquals("a", actual);
    }

    @Test
    void equalsBlank() {
        String s = "a";
        String t = "aa";
        String actual = test.minWindow(s, t);
        assertEquals("", actual);
    }
}