/*
 * Copyright (c) 2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e303;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link NumArray}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2025/03/25 22:35
 */
class NumArrayTest {
    private NumArray test;

    @BeforeEach
    void setUp() {
        test = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
    }

    @Test
    void test1() {
        assertEquals(1, test.sumRange(0, 2));
        assertEquals(-1, test.sumRange(2, 5));
        assertEquals(-3, test.sumRange(0, 5));
    }
}