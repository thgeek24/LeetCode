/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.e26;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link RemoveDuplicatesFromSortedArray}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/17 10:55
 */
class RemoveDuplicatesFromSortedArrayTest {
    private List<RemoveDuplicatesFromSortedArray> tests;

    @BeforeEach
    void setUp() {
        tests = Arrays.asList(new RemoveDuplicatesFromSortedArray.Solution1(), new RemoveDuplicatesFromSortedArray.Solution2());
    }

    @Test
    void test1() {
        int expected = 6;
        int[] afterRemoving = {0, 1, 2, 3, 4, 5};
        for (RemoveDuplicatesFromSortedArray test : tests) {
            int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 5, 5};
            assertEquals(expected, test.removeDuplicates(nums));
            for (int i = 0; i < afterRemoving.length; i++) {
                assertEquals(afterRemoving[i], nums[i]);
            }
        }
    }

    @Test
    void test2() {
        int expected = 5;
        int[] afterRemoving = {0, 1, 2, 3, 4};
        for (RemoveDuplicatesFromSortedArray test : tests) {
            int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
            assertEquals(expected, test.removeDuplicates(nums));
            for (int i = 0; i < afterRemoving.length; i++) {
                assertEquals(afterRemoving[i], nums[i]);
            }
        }
    }
}