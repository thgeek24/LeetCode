/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w424;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link MinimizeTheMaximumAdjacentElementDifference}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/20 08:34
 */
class MinimizeTheMaximumAdjacentElementDifferenceTest {
    private List<MinimizeTheMaximumAdjacentElementDifference> tests;

    @BeforeEach
    void setUp() {
        tests = MinimizeTheMaximumAdjacentElementDifference.getAllSolutions();
    }

    @Test
    void equalsFour() {
        int[] nums = {1, 2, -1, 10, 8};
        int expected = 4;
        tests.forEach(test -> assertEquals(expected, test.minDifference(nums)));
    }

    @Test
    void equalsZero() {
        int[] nums = {-1, -1, -1};
        int expected = 0;
        tests.forEach(test -> assertEquals(expected, test.minDifference(nums)));
    }

    @Test
    void equalsOne() {
        int[] nums = {-1, 10, -1, 8};
        int expected = 1;
        tests.forEach(test -> assertEquals(expected, test.minDifference(nums)));
    }
}