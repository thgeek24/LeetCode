/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link LargestDivisibleSubset_368}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/10 16:05
 */
class LargestDivisibleSubset_368Test {
    private LargestDivisibleSubset_368 test;
    private final int[] nums1 = {1, 2, 3};
    private final int[] nums2 = {1, 2, 4, 8};
    private final int[] nums3 = {4, 8, 10, 240};
    private final int[] nums4 = {3, 4, 16, 8};

    private final List<List<Integer>> expected1 = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(1, 3));
    private final List<Integer> expected2 = Arrays.asList(1, 2, 4, 8);
    private final List<Integer> expected3 = Arrays.asList(4, 8, 240);
    private final List<Integer> expected4 = Arrays.asList(4, 8, 16);

    @BeforeEach
    void setUp() {
        test = new LargestDivisibleSubset_368();
    }

    @Test
    void test1() {
        List<Integer> res = test.largestDivisibleSubset(nums1);
        assertEquals(2, res.size());
        boolean isMatched = expected1.stream().anyMatch(item -> compareLists(item, res));
        assertTrue(isMatched);
    }

    @Test
    void test2() {
        List<Integer> res = test.largestDivisibleSubset(nums2);
        assertEquals(4, res.size());
        for (int i = 0; i < expected2.size(); i++) {
            assertEquals(expected2.get(i), res.get(i));
        }
    }

    @Test
    void test3() {
        List<Integer> res = test.largestDivisibleSubset(nums3);
        assertEquals(3, res.size());
        for (int i = 0; i < expected3.size(); i++) {
            assertEquals(expected3.get(i), res.get(i));
        }
    }

    @Test
    void test4() {
        List<Integer> res = test.largestDivisibleSubset(nums4);
        assertEquals(3, res.size());
        for (int i = 0; i < expected4.size(); i++) {
            assertEquals(expected4.get(i), res.get(i));
        }
    }

    private boolean compareLists(List<Integer> list1, List<Integer> list2) {
        if (list1 == list2) {
            return true;
        }
        if (list1 == null || list2 == null) {
            return false;
        }
        if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            if (!Objects.equals(list1.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }
}