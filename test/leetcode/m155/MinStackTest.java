/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.m155;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link MinStack}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/04 09:24
 */
class MinStackTest {
    private final MinStack test = new MinStack();

    @Test
    void test() {
        test.push(-2);
        test.push(0);
        test.push(-3);
        assertEquals(-3, test.getMin());
        test.pop();
        assertEquals(0, test.top());
        assertEquals(-2, test.getMin());
    }
}