/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m1318;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link MinimumFlipsToMakeAORBEqualToC}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/06 22:34
 */
class MinimumFlipsToMakeAORBEqualToCTest {
    private MinimumFlipsToMakeAORBEqualToC test;

    @BeforeEach
    void setUp() {
        test = new MinimumFlipsToMakeAORBEqualToC();
    }

    @Test
    void equalsThree() {
        int a = 2;
        int b = 6;
        int c = 5;
        int expected = 3;
        assertEquals(expected, test.minFlips(a, b, c));
    }

    @Test
    void equalsOne() {
        int a = 4;
        int b = 2;
        int c = 7;
        int expected = 1;
        assertEquals(expected, test.minFlips(a, b, c));
    }

    @Test
    void equalsZero() {
        int a = 1;
        int b = 2;
        int c = 3;
        int expected = 0;
        assertEquals(expected, test.minFlips(a, b, c));
    }
}