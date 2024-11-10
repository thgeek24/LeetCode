/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w423;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/10 10:35
 */
class AdjacentIncreasingSubarraysDetectionITest {
    private AdjacentIncreasingSubarraysDetectionI test;

    @BeforeEach
    void setUp() {
        test = new AdjacentIncreasingSubarraysDetectionI();
    }

    @Test
    void isTrue() {
        List<Integer> nums = Arrays.asList(2, 5, 7, 8, 9, 2, 3, 4, 3, 1);
        int k = 3;
        assertTrue(test.hasIncreasingSubarrays(nums, k));
    }

    @Test
    void isFalse() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 4, 4, 4, 5, 6, 7);
        int k = 5;
        assertFalse(test.hasIncreasingSubarrays(nums, k));
    }

    @Test
    void isTrue2() {
        List<Integer> nums = Arrays.asList(-15, 19);
        int k = 1;
        assertTrue(test.hasIncreasingSubarrays(nums, k));
    }

    @Test
    void isTrue3() {
        List<Integer> nums = Arrays.asList(19, 5);
        int k = 1;
        assertTrue(test.hasIncreasingSubarrays(nums, k));
    }
}