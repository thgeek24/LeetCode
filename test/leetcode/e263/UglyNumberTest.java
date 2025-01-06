/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e263;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link UglyNumber}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/01/06 11:16
 */
class UglyNumberTest {
    private UglyNumber test;

    @BeforeEach
    void setUp() {
        test = new UglyNumber();
    }

    @Test
    void test1() {
        int n = 6;
        assertTrue(test.isUgly(n));
    }

    @Test
    void test2() {
        int n = 1;
        assertTrue(test.isUgly(n));
    }

    @Test
    void test3() {
        int n = 14;
        assertFalse(test.isUgly(n));
    }
}