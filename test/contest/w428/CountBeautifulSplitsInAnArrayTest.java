/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w428;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link CountBeautifulSplitsInAnArray}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/15 11:31
 */
class CountBeautifulSplitsInAnArrayTest {
    private CountBeautifulSplitsInAnArray test;

    @BeforeEach
    void setUp() {
        test = new CountBeautifulSplitsInAnArray();
    }

    @Test
    void test1() {
        int[] nums = {1, 1, 2, 1};
        int expected = 2;
        assertEquals(expected, test.beautifulSplits(nums));
    }

    @Test
    void test2() {
        int[] nums = {1, 2, 3, 4};
        int expected = 0;
        assertEquals(expected, test.beautifulSplits(nums));
    }

    @Test
    void test3() {
        int[] nums = {1, 2, 3, 1, 2, 3, 4, 5, 7, 8};
        int expected = 4;
        assertEquals(expected, test.beautifulSplits(nums));
    }

    @Test
    void test4() {
        int[] nums = {2, 3, 2, 2, 1};
        int expected = 1;
        assertEquals(expected, test.beautifulSplits(nums));
    }

    @Test
    void test5() {
        int[] nums = {3, 3, 3, 1, 3};
        int expected = 3;
        assertEquals(expected, test.beautifulSplits(nums));
    }
}