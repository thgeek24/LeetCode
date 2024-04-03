/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link TrappingRainWater_42}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/03 11:06
 */
class TrappingRainWater_42Test {
    private TrappingRainWater_42 test;

    @BeforeEach
    void setUp() {
        test = new TrappingRainWater_42();
    }

    @Test
    void equalsSix() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        assertEquals(6, test.trap(height));
    }

    @Test
    void equalsNine() {
        int[] height = {4, 2, 0, 3, 2, 5};
        assertEquals(9, test.trap(height));
    }

    @Test
    void equalsOne() {
        int[] height = {4, 2, 3};
        assertEquals(1, test.trap(height));
    }
}