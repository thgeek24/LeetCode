/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e342;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link PowerOfFour}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/29 08:02
 */
class PowerOfFourTest {
    private PowerOfFour test;

    @BeforeEach
    void setUp() {
        test = new PowerOfFour();
    }

    @Test
    void test1() {
        int n = 16;
        assertTrue(test.isPowerOfFour(n));
    }

    @Test
    void test2() {
        int n = 5;
        assertFalse(test.isPowerOfFour(n));
    }

    @Test
    void test3() {
        int n = 1;
        assertTrue(test.isPowerOfFour(n));
    }
}