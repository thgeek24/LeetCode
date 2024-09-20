/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m238;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link ProductOfArrayExceptSelf}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/20 10:32
 */
class ProductOfArrayExceptSelfTest {
    private ProductOfArrayExceptSelf test;

    @BeforeEach
    void setUp() {
        test = new ProductOfArrayExceptSelf();
    }

    @Test
    void test1() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals(expected, test.productExceptSelf(nums));
    }

    @Test
    void test2() {
        int[] nums = {-1, 1, 0, -3, 3};
        int[] expected = {0, 0, 9, 0, 0};
        assertArrayEquals(expected, test.productExceptSelf(nums));
    }
}