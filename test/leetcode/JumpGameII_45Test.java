/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link JumpGameII_45}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/19 09:54
 */
class JumpGameII_45Test {
    private JumpGameII_45 test;

    @BeforeEach
    void setUp() {
        test = new JumpGameII_45();
    }

    @Test
    void equalsTwo() {
        int[] nums = {2, 3, 1, 1, 4};
        int actual = test.jump(nums);
        assertEquals(2, actual);
    }

    @Test
    void equalsTwo2() {
        int[] nums = {2, 3, 0, 1, 4};
        int actual = test.jump(nums);
        assertEquals(2, actual);
    }
}