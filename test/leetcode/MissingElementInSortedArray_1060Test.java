/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MissingElementInSortedArray_1060}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/09 10:18
 */
class MissingElementInSortedArray_1060Test {
    private MissingElementInSortedArray_1060 test;

    @BeforeEach
    void setUp() {
        test = new MissingElementInSortedArray_1060();
    }

    @Test
    void equalsFive() {
        int[] nums = {4, 7, 9, 10};
        int k = 1;
        assertEquals(5, test.missingElement(nums, k));
    }

    @Test
    void equalsEight() {
        int[] nums = {4, 7, 9, 10};
        int k = 3;
        assertEquals(8, test.missingElement(nums, k));
    }

    @Test
    void equalsSix() {
        int[] nums = {1, 2, 4};
        int k = 3;
        assertEquals(6, test.missingElement(nums, k));
    }
}