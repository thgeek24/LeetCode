/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link PreviousPermutationWithOneSwap_1053}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/28 14:10
 */
class PreviousPermutationWithOneSwap_1053Test {
    private PreviousPermutationWithOneSwap_1053 test;

    @BeforeEach
    void setUp() {
        test = new PreviousPermutationWithOneSwap_1053();
    }

    @Test
    void test1() {
        int[] arr = {3, 2, 1};
        int[] expected = {3, 1, 2};
        assertArrayEquals(expected, test.prevPermOpt1(arr));
    }

    @Test
    void test2() {
        int[] arr = {1, 1, 5};
        int[] expected = {1, 1, 5};
        assertArrayEquals(expected, test.prevPermOpt1(arr));
    }

    @Test
    void test3() {
        int[] arr = {1, 9, 4, 6, 7};
        int[] expected = {1, 7, 4, 6, 9};
        assertArrayEquals(expected, test.prevPermOpt1(arr));
    }

    @Test
    void test4() {
        int[] arr = {3, 1, 1, 3};
        int[] expected = {1, 3, 1, 3};
        assertArrayEquals(expected, test.prevPermOpt1(arr));
    }
}