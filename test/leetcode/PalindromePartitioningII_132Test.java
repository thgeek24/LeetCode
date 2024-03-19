/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/07 15:41
 */
class PalindromePartitioningII_132Test {
    PalindromePartitioningII_132 test;

    @BeforeEach
    void setUp() {
        test = new PalindromePartitioningII_132();
    }

    @Test
    void equalsOne() {
        String s = "aab";
        assertEquals(1, test.minCut(s));
    }

    @Test
    void equalsZero() {
        String s = "a";
        assertEquals(0, test.minCut(s));
    }

    @Test
    void equalsZero_() {
        String s = "ab";
        assertEquals(1, test.minCut(s));
    }

    @Test
    void equalsOne_() {
        String s = "abacgc";
        assertEquals(1, test.minCut(s));
    }
}