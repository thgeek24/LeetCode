/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m55;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link JumpGame}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/22 10:58
 */
class JumpGameTest {
    private JumpGame test;

    @BeforeEach
    void setUp() {
        test = new JumpGame();
    }

    @Test
    void test1() {
        int[] nums = {2, 3, 1, 1, 4};
        assertTrue(test.canJump(nums));
    }

    @Test
    void setTest2() {
        int[] nums = {3, 2, 1, 0, 4};
        assertFalse(test.canJump(nums));
    }
}