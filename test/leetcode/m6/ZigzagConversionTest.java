/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link ZigzagConversion}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/25 14:21
 */
class ZigzagConversionTest {
    private ZigzagConversion test;

    @BeforeEach
    void setUp() {
        test = new ZigzagConversion();
    }

    @Test
    void test1() {
        String s = "PAYPALISHIRING";
        String expected = "PAHNAPLSIIGYIR";
        assertEquals(expected, test.convert(s, 3));
    }

    @Test
    void test2() {
        String s = "PAYPALISHIRING";
        String expected = "PINALSIGYAHRPI";
        assertEquals(expected, test.convert(s, 4));
    }

    @Test
    void test3() {
        String s = "A";
        String expected = "A";
        assertEquals(expected, test.convert(s, 1));
    }

    @Test
    void test4() {
        String s = "AB";
        String expected = "AB";
        assertEquals(expected, test.convert(s, 1));
    }
}