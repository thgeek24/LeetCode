/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m80;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link RemoveDuplicatesFromSortedArrayII}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/17 11:23
 */
class RemoveDuplicatesFromSortedArrayIITest {
    private RemoveDuplicatesFromSortedArrayII test;

    @BeforeEach
    void setUp() {
        test = new RemoveDuplicatesFromSortedArrayII();
    }

    @Test
    void test1() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int[] expectedNums = {1, 1, 2, 2, 3};
        int expected = 5;
        int actual = test.removeDuplicates(nums);
        assertEquals(expected, actual);
        for (int i = 0; i < expectedNums.length; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }

    @Test
    void test2() {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int[] expectedNums = {0, 0, 1, 1, 2, 3, 3};
        int expected = 7;
        int actual = test.removeDuplicates(nums);
        assertEquals(expected, actual);
        for (int i = 0; i < expectedNums.length; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
}