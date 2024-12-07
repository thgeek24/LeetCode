/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m137;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link SingleNumberII}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/27 22:57
 */
class SingleNumberIITest {
    private SingleNumberII test;

    @BeforeEach
    void setUp() {
        test = new SingleNumberII();
    }

    @Test
    void equalsThree() {
        int[] nums = {2, 2, 3, 2};
        int expected = 3;
        assertEquals(expected, test.singleNumber(nums));
    }

    @Test
    void equalsNinetyNine() {
        int[] nums = {0, 1, 0, 1, 0, 1, 99};
        int expected = 99;
        assertEquals(expected, test.singleNumber(nums));
    }
}