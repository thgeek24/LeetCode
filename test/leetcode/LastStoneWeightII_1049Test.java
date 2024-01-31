/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link  LastStoneWeightII_1049}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/22 12:00
 */
class LastStoneWeightII_1049Test {
    private LastStoneWeightII_1049 test;

    @BeforeEach
    void setUp() {
        test = new LastStoneWeightII_1049();
    }

    @Test
    void equalsOne() {
        int[] nums = {2, 7, 4, 1, 8, 1};
        int one = test.lastStoneWeightII(nums);
        assertEquals(1, one);
    }

    @Test
    void equalsFive() {
        int[] nums = {31, 26, 33, 21, 40};
        int five = test.lastStoneWeightII(nums);
        assertEquals(5, five);
    }
}