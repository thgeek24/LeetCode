/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1657;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for {@link DetermineIfTwoStringsAreClose}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/05 10:09
 */
class DetermineIfTwoStringsAreCloseTest {
    private DetermineIfTwoStringsAreClose test;

    @BeforeEach
    void setUp() {
        test = new DetermineIfTwoStringsAreClose();
    }

    @Test
    void isTrue() {
        String word1 = "abc";
        String word2 = "bca";
        assertTrue(test.closeStrings(word1, word2));
    }

    @Test
    void isFalse() {
        String word1 = "a";
        String word2 = "aa";
        assertFalse(test.closeStrings(word1, word2));
    }

    @Test
    void isTrue2() {
        String word1 = "cabbba";
        String word2 = "abbccc";
        assertTrue(test.closeStrings(word1, word2));
    }
}