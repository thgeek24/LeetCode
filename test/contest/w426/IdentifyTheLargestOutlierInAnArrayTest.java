/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w426;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link IdentifyTheLargestOutlierInAnArray}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/01 10:56
 */
class IdentifyTheLargestOutlierInAnArrayTest {
    private IdentifyTheLargestOutlierInAnArray test;

    @BeforeEach
    void setUp() {
        test = new IdentifyTheLargestOutlierInAnArray();
    }

    @Test
    void equalsTen() {
        int[] nums = {2, 3, 5, 10};
        int expected = 10;
        assertEquals(expected, test.getLargestOutlier(nums));
    }

    @Test
    void equalsFour() {
        int[] nums = {-2, -1, -3, -6, 4};
        int expected = 4;
        assertEquals(expected, test.getLargestOutlier(nums));
    }

    @Test
    void equalsFive() {
        int[] nums = {1, 1, 1, 1, 1, 5, 5};
        int expected = 5;
        assertEquals(expected, test.getLargestOutlier(nums));
    }

    @Test
    void equalsZero() {
        int[] nums = {752, 678, -483, -583, 201, 0, -886, -474, -171};
        int expected = 0;
        assertEquals(expected, test.getLargestOutlier(nums));
    }

    @Test
    void test5() {
        int[] nums = {854, 793, -96, 488, -720, -957, -149, 815, -352, -262, -737, 579, 494, -71, 153, 283, -266};
        int expected = -737;
        assertEquals(expected, test.getLargestOutlier(nums));
    }
}