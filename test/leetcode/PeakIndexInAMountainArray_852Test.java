/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link PeakIndexInAMountainArray_852}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/10 10:58
 */
class PeakIndexInAMountainArray_852Test {
    private PeakIndexInAMountainArray_852 test;

    @BeforeEach
    void setUp() {
        test = new PeakIndexInAMountainArray_852();
    }

    @Test
    void equalsOne() {
        int[] arr = {0, 1, 0};
        assertEquals(1, test.peakIndexInMountainArray(arr));
    }

    @Test
    void equalsOne2() {
        int[] arr = {0, 2, 1, 0};
        assertEquals(1, test.peakIndexInMountainArray(arr));
    }

    @Test
    void equalsOne3() {
        int[] arr = {0, 10, 5, 2};
        assertEquals(1, test.peakIndexInMountainArray(arr));
    }
}