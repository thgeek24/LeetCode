/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link RomanToInteger}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/01/14 10:12
 */
class RomanToIntegerTest {
    private RomanToInteger test;

    @BeforeEach
    void setUp() {
        test = new RomanToInteger();
    }

    @Test
    void test1() {
        String s = "III";
        int expected = 3;
        assertEquals(expected, test.romanToInt(s));
    }

    @Test
    void test2() {
        String s = "LVIII";
        int expected = 58;
        assertEquals(expected, test.romanToInt(s));
    }

    @Test
    void test3() {
        String s = "MCMXCIV";
        int expected = 1994;
        assertEquals(expected, test.romanToInt(s));
    }
}