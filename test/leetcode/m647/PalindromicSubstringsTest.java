/*
 * Copyright (c) 2024-2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m647;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link PalindromicSubstrings}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/09 12:04
 */
class PalindromicSubstringsTest {
    private PalindromicSubstrings test;

    @BeforeEach
    void setUp() {
        test = new PalindromicSubstrings();
    }

    @Test
    void equalsThree() {
        String s = "abc";
        assertEquals(3, test.countSubstrings(s));
    }

    @Test
    void equalsSix() {
        String s = "aaa";
        assertEquals(6, test.countSubstrings(s));
    }
}