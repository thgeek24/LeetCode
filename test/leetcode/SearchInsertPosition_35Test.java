/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link SearchInsertPosition_35}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/18 21:03
 */
class SearchInsertPosition_35Test {
    private SearchInsertPosition_35 test;

    @BeforeEach
    void setUp() {
        test = new SearchInsertPosition_35();
    }

    @Test
    void equalsOne() {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int actual = test.searchInsert(nums, target);
        assertEquals(1, actual);
    }
}