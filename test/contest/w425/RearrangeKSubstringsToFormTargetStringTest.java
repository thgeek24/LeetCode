/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w425;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/24 11:07
 */
class RearrangeKSubstringsToFormTargetStringTest {
    private RearrangeKSubstringsToFormTargetString test;

    @BeforeEach
    void setUp() {
        test = new RearrangeKSubstringsToFormTargetString();
    }

    @Test
    void isTrue() {
        String s = "abcd";
        String t = "cdab";
        int k = 2;
        assertTrue(test.isPossibleToRearrange(s, t, k));
    }

    @Test
    void isTrue2() {
        String s = "aabbcc";
        String t = "bbaacc";
        int k = 3;
        assertTrue(test.isPossibleToRearrange(s, t, k));
    }

    @Test
    void isFalse() {
        String s = "aabbcc";
        String t = "bbaacc";
        int k = 2;
        assertFalse(test.isPossibleToRearrange(s, t, k));
    }

    @Test
    void isFalse2() {
        String s = "nngggnng";
        String t = "nnggnngg";
        int k = 2;
        assertFalse(test.isPossibleToRearrange(s, t, k));
    }
}