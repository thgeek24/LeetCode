/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * LeetCode 1400
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/09 09:24
 */
class ConstructKPalindromeStrings_1400Test {
    private ConstructKPalindromeStrings_1400 test;

    @BeforeEach
    void setUp() {
        test = new ConstructKPalindromeStrings_1400();
    }

    @Test
    void isTrue() {
        String s = "annabelle";
        int k = 2;
        assertTrue(test.canConstruct(s, k));
    }

    @Test
    void isFalse() {
        String s = "leetcode";
        int k = 3;
        assertFalse(test.canConstruct(s, k));
    }

    @Test
    void isTrue2() {
        String s = "true";
        int k = 4;
        assertTrue(test.canConstruct(s, k));
    }

    @Test
    void isTrue3() {
        String s = "qlkzenwmmnpkopu";
        int k = 15;
        assertTrue(test.canConstruct(s, k));
    }
}