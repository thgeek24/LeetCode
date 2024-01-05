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
 * @since 2024/01/05 12:00
 */
class IsSubsequence_392Test {
    private IsSubsequence_392 test;

    @BeforeEach
    void setUp() {
        test = new IsSubsequence_392();
    }

    @Test
    void isSubsequence() {
        String s = "abc";
        String t = "ahbgdc";
        assertTrue(test.isSubsequence(s, t));
    }

    @Test
    void isNotSubsequence() {
        String s = "axc";
        String t = "ahbgdc";
        assertFalse(test.isSubsequence(s, t));
    }
}