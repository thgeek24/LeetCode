/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m97;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link InterleavingString}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/28 12:54
 */
class InterleavingStringTest {
    private InterleavingString test;

    @BeforeEach
    void setUp() {
        test = new InterleavingString();
    }

    @Test
    void isTrue() {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        assertTrue(test.isInterleave(s1, s2, s3));
    }

    @Test
    void isFalse() {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbbaccc";
        assertFalse(test.isInterleave(s1, s2, s3));
    }

    @Test
    void isTrue2() {
        String s1 = "";
        String s2 = "";
        String s3 = "";
        assertTrue(test.isInterleave(s1, s2, s3));
    }

    @Test
    void isFalse2() {
        String s1 = "a";
        String s2 = "";
        String s3 = "c";
        assertFalse(test.isInterleave(s1, s2, s3));
    }

    @Test
    void isTrue3() {
        String s1 = "aa";
        String s2 = "ab";
        String s3 = "abaa";
        assertTrue(test.isInterleave(s1, s2, s3));
    }
}