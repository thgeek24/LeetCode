/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import leetcode.m300.LongestIncreasingSubsequence;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link LongestIncreasingSubsequence}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/02 16:11
 */
class LongestIncreasingSubsequenceTest {
    private List<LongestIncreasingSubsequence> solutions;

    @BeforeEach
    void setUp() {
        solutions = Arrays.asList(
                new LongestIncreasingSubsequence.LongestIncreasingSubsequenceSol1(),
                new LongestIncreasingSubsequence.LongestIncreasingSubsequenceSol2());
    }

    @Test
    void equalFour() {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        for (LongestIncreasingSubsequence solution : solutions) {
            assertEquals(4, solution.lengthOfLIS(nums));
        }
    }

    @Test
    void equalFour_() {
        int[] nums = {0, 1, 0, 3, 2, 3};
        for (LongestIncreasingSubsequence solution : solutions) {
            assertEquals(4, solution.lengthOfLIS(nums));
        }
    }

    @Test
    void equalOne() {
        int[] nums = {7, 7, 7, 7, 7, 7, 7};
        for (LongestIncreasingSubsequence solution : solutions) {
            assertEquals(1, solution.lengthOfLIS(nums));
        }
    }
}