/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1433;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for {@link CheckIfAStringCanBreakAnotherString}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/13 16:48
 */
class CheckIfAStringCanBreakAnotherStringTest {
    private CheckIfAStringCanBreakAnotherString test;

    @BeforeEach
    void setUp() {
        test = new CheckIfAStringCanBreakAnotherString();
    }

    @Test
    void isTrue() {
        String s1 = "abc";
        String s2 = "xya";
        assertTrue(test.checkIfCanBreak(s1, s2));
    }

    @Test
    void isFalse() {
        String s1 = "abe";
        String s2 = "acd";
        assertFalse(test.checkIfCanBreak(s1, s2));
    }

    @Test
    void isTrue2() {
        String s1 = "leetcodee";
        String s2 = "interview";
        assertTrue(test.checkIfCanBreak(s1, s2));
    }

    @Test
    void isTrue3() {
        String s1 = "yopumzgd";
        String s2 = "pamntyya";
        assertTrue(test.checkIfCanBreak(s1, s2));
    }
}