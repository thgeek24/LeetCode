/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Test for {@link MinimumWindowSubstring_76}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/01 15:43
 */
class MinimumWindowSubstring_76Test {
    private MinimumWindowSubstring_76 test;

    @BeforeEach
    void setUp() {
        test = new MinimumWindowSubstring_76();
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