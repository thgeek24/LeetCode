/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link BestSightseeingPair}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/12/27 09:32
 */
class BestSightseeingPairTest {
    private BestSightseeingPair test;

    @BeforeEach
    void setUp() {
        test = new BestSightseeingPair();
    }

    @Test
    void test1() {
        int[] values = {8, 1, 5, 2, 6};
        int expected = 11;
        assertEquals(expected, test.maxScoreSightseeingPair(values));
    }

    @Test
    void test2() {
        int[] values = {1, 2};
        int expected = 2;
        assertEquals(expected, test.maxScoreSightseeingPair(values));
    }
}