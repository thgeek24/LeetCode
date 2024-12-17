/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w428;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link CountBeautifulSplitsInAnArray}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/15 11:31
 */
class CountBeautifulSplitsInAnArrayTest {
    private List<CountBeautifulSplitsInAnArray> tests;

    @BeforeEach
    void setUp() {
        tests = Arrays.asList(new CountBeautifulSplitsInAnArray.Solution1(), new CountBeautifulSplitsInAnArray.Solution2());
    }

    @Test
    void test1() {
        int[] nums = {1, 1, 2, 1};
        int expected = 2;
        tests.forEach(test -> assertEquals(expected, test.beautifulSplits(nums)));
    }

    @Test
    void test2() {
        int[] nums = {1, 2, 3, 4};
        int expected = 0;
        tests.forEach(test -> assertEquals(expected, test.beautifulSplits(nums)));
    }

    @Test
    void test3() {
        int[] nums = {1, 2, 3, 1, 2, 3, 4, 5, 7, 8};
        int expected = 4;
        tests.forEach(test -> assertEquals(expected, test.beautifulSplits(nums)));
    }

    @Test
    void test4() {
        int[] nums = {2, 3, 2, 2, 1};
        int expected = 1;
        tests.forEach(test -> assertEquals(expected, test.beautifulSplits(nums)));
    }

    @Test
    void test5() {
        int[] nums = {3, 3, 3, 1, 3};
        int expected = 3;
        tests.forEach(test -> assertEquals(expected, test.beautifulSplits(nums)));
    }
}