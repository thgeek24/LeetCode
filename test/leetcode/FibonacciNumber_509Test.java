/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link FibonacciNumber_509}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/08 16:41
 */
class FibonacciNumber_509Test {
    private FibonacciNumber_509 test;

    @BeforeEach
    void setUp() {
        test = new FibonacciNumber_509();
    }

    @Test
    void twoFibOne() {
        int one = test.fib(2);
        assertEquals(1, one);
    }

    @Test
    void threeFibTwo() {
        int two = test.fib(3);
        assertEquals(2, two);
    }

    @Test
    void fourFibThree() {
        int three = test.fib(4);
        assertEquals(3, three);
    }
}