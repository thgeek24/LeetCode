/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m201;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link BitwiseANDOfNumbersRange}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/28 09:40
 */
class BitwiseANDOfNumbersRangeTest {
    private BitwiseANDOfNumbersRange test;

    @BeforeEach
    void setUp() {
        test = new BitwiseANDOfNumbersRange();
    }

    @Test
    void equalsFour() {
        int left = 5;
        int right = 7;
        int expected = 4;
        assertEquals(expected, test.rangeBitwiseAnd(left, right));
    }

    @Test
    void equalsZero() {
        int left = 0;
        int right = 0;
        int expected = 0;
        assertEquals(expected, test.rangeBitwiseAnd(left, right));
    }

    @Test
    void equalsZero2() {
        int left = 1;
        int right = 2147483647;
        int expected = 0;
        assertEquals(expected, test.rangeBitwiseAnd(left, right));
    }
}