/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w427;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link TransformedArray}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/08 10:32
 */
class TransformedArrayTest {
    private TransformedArray test;

    @BeforeEach
    void setUp() {
        test = new TransformedArray();
    }

    @Test
    void test1() {
        int[] nums = {3, -2, 1, 1};
        int[] expected = {1, 1, 1, 3};
        assertArrayEquals(expected, test.constructTransformedArray(nums));
    }

    @Test
    void test2() {
        int[] nums = {-1, 4, -1};
        int[] expected = {-1, -1, 4};
        assertArrayEquals(expected, test.constructTransformedArray(nums));
    }

    @Test
    void test3() {
        int[] nums = {-9, 0};
        int[] expected = {0, 0};
        assertArrayEquals(expected, test.constructTransformedArray(nums));
    }
}