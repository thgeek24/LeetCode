/*
 * Copyright (c) 2024-2025 THGEEK.COM. All rights reserved.
 */

package leetcode.e35;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link SearchInsertPosition}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/18 21:03
 */
class SearchInsertPositionTest {
    private SearchInsertPosition test;

    @BeforeEach
    void setUp() {
        test = new SearchInsertPosition();
    }

    @Test
    void equalsOne() {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int actual = test.searchInsert(nums, target);
        assertEquals(1, actual);
    }
}