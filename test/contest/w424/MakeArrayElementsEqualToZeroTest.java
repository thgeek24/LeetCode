/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w424;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/17 10:31
 */
class MakeArrayElementsEqualToZeroTest {
    private MakeArrayElementsEqualToZero test;

    @BeforeEach
    void setUp() {
        test = new MakeArrayElementsEqualToZero();
    }

    @Test
    void equalsTwo() {
        int[] nums = {1, 0, 2, 0, 3};
        int expected = 2;
        assertEquals(expected, test.countValidSelections(nums));
    }

    @Test
    void equalsZero() {
        int[] nums = {2, 3, 4, 0, 4, 1, 0};
        int expected = 0;
        assertEquals(expected, test.countValidSelections(nums));
    }

    @Test
    void equalsThree() {
        int[] nums = {16, 13, 10, 0, 0, 0, 10, 6, 7, 8, 7};
        int expected = 3;
        assertEquals(expected, test.countValidSelections(nums));
    }
}