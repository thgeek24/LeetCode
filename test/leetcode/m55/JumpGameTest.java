/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m55;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for {@link JumpGame}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/22 10:58
 */
class JumpGameTest {
    private List<JumpGame> tests;

    @BeforeEach
    void setUp() {
        tests = Arrays.asList(new JumpGame.Solution1(), new JumpGame.Solution2());
    }

    @Test
    void test1() {
        int[] nums = {2, 3, 1, 1, 4};
        tests.forEach(test -> assertTrue(test.canJump(nums)));
    }

    @Test
    void setTest2() {
        int[] nums = {3, 2, 1, 0, 4};
        tests.forEach(test -> assertFalse(test.canJump(nums)));
    }
}