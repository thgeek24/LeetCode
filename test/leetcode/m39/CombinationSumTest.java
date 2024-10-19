/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m39;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import support.ListComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for {@link CombinationSum}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/19 10:30
 */
class CombinationSumTest {
    private CombinationSum test;

    @BeforeEach
    void setUp() {
        test = new CombinationSum();
    }

    @Test
    void test1() {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> expected = Arrays.asList(Collections.singletonList(7), Arrays.asList(3, 2, 2));
        List<List<Integer>> actual = test.combinationSum(candidates, target);
        assertTrue(ListComparator.equals(expected, actual));
    }

    @Test
    void test2() {
        int[] candidates = {2, 3, 5};
        int target = 8;
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(5, 3), Arrays.asList(3, 3, 2), Arrays.asList(2, 2, 2, 2));
        List<List<Integer>> actual = test.combinationSum(candidates, target);
        assertTrue(ListComparator.equals(expected, actual));
    }

    @Test
    void test3() {
        int[] candidates = {2};
        int target = 1;
        List<List<Integer>> expected = Collections.emptyList();
        List<List<Integer>> actual = test.combinationSum(candidates, target);
        assertTrue(ListComparator.equals(expected, actual));
    }
}