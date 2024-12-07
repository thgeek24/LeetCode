/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.e3345;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link SmallestDivisibleDigitProductI}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/21 11:07
 */
class SmallestDivisibleDigitProductITest {
    private SmallestDivisibleDigitProductI test;

    @BeforeEach
    void setUp() {
        test = new SmallestDivisibleDigitProductI();
    }

    @Test
    void equalsTen() {
        int n = 10;
        int t = 2;
        assertEquals(10, test.smallestNumber(n, t));
    }

    @Test
    void equalsSixteen() {
        int n = 15;
        int t = 3;
        assertEquals(16, test.smallestNumber(n, t));
    }
}