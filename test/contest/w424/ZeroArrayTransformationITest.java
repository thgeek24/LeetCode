/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w424;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link ZeroArrayTransformationI}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/17 10:53
 */
class ZeroArrayTransformationITest {
    private ZeroArrayTransformationI test;

    @BeforeEach
    void setUp() {
        test = new ZeroArrayTransformationI();
    }

    @Test
    void isTrue() {
        int[] nums = {1, 0, 1};
        int[][] queries = {{0, 2}};
        assertTrue(test.isZeroArray(nums, queries));
    }

    @Test
    void isFalse() {
        int[] nums = {4, 3, 2, 1};
        int[][] queries = {{1, 3}, {0, 2}};
        assertFalse(test.isZeroArray(nums, queries));
    }
}