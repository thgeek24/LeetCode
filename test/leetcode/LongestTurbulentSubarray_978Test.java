/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link LongestTurbulentSubarray_978}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/03/28 10:31
 */
class LongestTurbulentSubarray_978Test {
    private LongestTurbulentSubarray_978 test;

    @BeforeEach
    void setUp() {
        test = new LongestTurbulentSubarray_978();
    }

    @Test
    void equalsFive() {
        int[] arr = {9, 4, 2, 10, 7, 8, 8, 1, 9};
        assertEquals(5, test.maxTurbulenceSize(arr));
    }

    @Test
    void equalsTwo() {
        int[] arr = {4, 8, 12, 16};
        assertEquals(2, test.maxTurbulenceSize(arr));
    }

    @Test
    void equalsOne() {
        int[] arr = {100};
        assertEquals(1, test.maxTurbulenceSize(arr));
    }
}