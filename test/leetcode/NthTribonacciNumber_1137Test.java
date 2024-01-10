/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link NthTribonacciNumber_1137}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/10 15:55
 */
class NthTribonacciNumber_1137Test {
    private NthTribonacciNumber_1137 test;

    @BeforeEach
    void setUp() {
        test = new NthTribonacciNumber_1137();
    }

    @Test
    void testFour() {
        int four = test.tribonacci(4);
        assertEquals(4, four);
    }

    @Test
    void testTwentyFive() {
        int res = test.tribonacci(25);
        assertEquals(1389537, res);
    }
}