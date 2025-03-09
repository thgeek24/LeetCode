/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m373;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link FindKPairsWithSmallestSums}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/26 09:48
 */
class FindKPairsWithSmallestSumsTest {
    private FindKPairsWithSmallestSums test;

    @BeforeEach
    void setUp() {
        test = new FindKPairsWithSmallestSums();
    }

    @Test
    void test1() {
        int[] nums1 = {1, 7, 11};
        int[] nums2 = {2, 4, 6};
        int k = 3;
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 2),
                Arrays.asList(1, 4),
                Arrays.asList(1, 6));
        assertEquals(expected, test.kSmallestPairs(nums1, nums2, k));
    }

    @Test
    void test2() {
        int[] nums1 = {1, 1, 2};
        int[] nums2 = {1, 2, 3};
        int k = 2;
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 1),
                Arrays.asList(1, 1));
        assertEquals(expected, test.kSmallestPairs(nums1, nums2, k));
    }

    @Test
    void test3() {
        int[] nums1 = {1, 1, 2};
        int[] nums2 = {1, 2, 3};
        int k = 4;
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 1),
                Arrays.asList(1, 1),
                Arrays.asList(1, 2),
                Arrays.asList(2, 1));
        assertEquals(expected, test.kSmallestPairs(nums1, nums2, k));
    }
}