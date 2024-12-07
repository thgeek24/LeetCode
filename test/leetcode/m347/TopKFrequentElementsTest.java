/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m347;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test for {@link TopKFrequentElements}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/09 09:54
 */
class TopKFrequentElementsTest {
    private TopKFrequentElements test;

    @BeforeEach
    void setUp() {
        test = new TopKFrequentElements();
    }

    @Test
    void test1() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] expected = {1, 2};
        assertArrayEquals(expected, test.topKFrequent(nums, k));
    }

    @Test
    void test2() {
        int[] nums = {1};
        int k = 1;
        int[] expected = {1};
        assertArrayEquals(expected, test.topKFrequent(nums, k));
    }
}