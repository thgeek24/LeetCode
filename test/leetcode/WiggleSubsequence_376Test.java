/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link WiggleSubsequence_376}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/22 13:04
 */
class WiggleSubsequence_376Test {
    private WiggleSubsequence_376 test;

    @BeforeEach
    void setUp() {
        test = new WiggleSubsequence_376();
    }

    @Test
    void equalsSix() {
        int[] nums = {1, 7, 4, 9, 2, 5};
        assertEquals(6, test.wiggleMaxLength(nums));
    }

    @Test
    void equalsSeven() {
        int[] nums = {1, 17, 5, 10, 13, 15, 10, 5, 16, 8};
        assertEquals(7, test.wiggleMaxLength(nums));
    }

    @Test
    void equalsTwo() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(2, test.wiggleMaxLength(nums));
    }
}