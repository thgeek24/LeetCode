/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link IntegerToRoman}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/22 09:04
 */
class IntegerToRomanTest {
    private IntegerToRoman test;

    @BeforeEach
    void setUp() {
        test = new IntegerToRoman();
    }

    @Test
    void test1() {
        int num = 3749;
        String expected = "MMMDCCXLIX";
        assertEquals(expected, test.intToRoman(num));
    }

    @Test
    void test2() {
        int num = 58;
        String expected = "LVIII";
        assertEquals(expected, test.intToRoman(num));
    }

    @Test
    void test3() {
        int num = 1994;
        String expected = "MCMXCIV";
        assertEquals(expected, test.intToRoman(num));
    }
}