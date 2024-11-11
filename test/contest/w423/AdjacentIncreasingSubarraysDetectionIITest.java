/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package contest.w423;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/11/10 11:03
 */
class AdjacentIncreasingSubarraysDetectionIITest {
    private AdjacentIncreasingSubarraysDetectionII test;

    @BeforeEach
    void setUp() {
        test = new AdjacentIncreasingSubarraysDetectionII();
    }

    @Test
    void equalsThree() {
        List<Integer> nums = Arrays.asList(2, 5, 7, 8, 9, 2, 3, 4, 3, 1);
        int expected = 3;
        assertEquals(expected, test.maxIncreasingSubarrays(nums));
    }

    @Test
    void equalsTwo() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 4, 4, 4, 5, 6, 7);
        int expected = 2;
        assertEquals(expected, test.maxIncreasingSubarrays(nums));
    }

    @Test
    void equalsOne() {
        List<Integer> nums = Arrays.asList(3, 2, 3);
        int expected = 1;
        assertEquals(expected, test.maxIncreasingSubarrays(nums));
    }

    @Test
    void equalsOne2() {
        List<Integer> nums = Arrays.asList(1, 2, 3);
        int expected = 1;
        assertEquals(expected, test.maxIncreasingSubarrays(nums));
    }

    @Test
    void equalsOne3() {
        List<Integer> nums = Arrays.asList(1, 2);
        int expected = 1;
        assertEquals(expected, test.maxIncreasingSubarrays(nums));
    }

    @Test
    void equalsOne4() {
        List<Integer> nums = Arrays.asList(2, 1);
        int expected = 1;
        assertEquals(expected, test.maxIncreasingSubarrays(nums));
    }

    @Test
    void equalsTwo2() {
        List<Integer> nums = Arrays.asList(8, -4, -1, 16, 20);
        int expected = 2;
        assertEquals(expected, test.maxIncreasingSubarrays(nums));
    }
}