/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e258;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link AddDigits}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/01/05 10:53
 */
class AddDigitsTest {
    private AddDigits test;

    @BeforeEach
    void setUp() {
        test = new AddDigits();
    }

    @Test
    void test1() {
        int num = 38;
        int expected = 2;
        assertEquals(expected, test.addDigits(num));
    }

    @Test
    void test2() {
        int num = 0;
        int expected = 0;
        assertEquals(expected, test.addDigits(num));
    }
}