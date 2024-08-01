/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link SumOfMutatedArrayClosestToTarget_1300}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/01 13:57
 */
class SumOfMutatedArrayClosestToTarget_1300Test {
    private SumOfMutatedArrayClosestToTarget_1300 test;

    @BeforeEach
    void setUp() {
        test = new SumOfMutatedArrayClosestToTarget_1300();
    }

    @Test
    void equalsThree() {
        int[] arr = {4, 9, 3};
        int target = 10;
        int actual = test.findBestValue(arr, target);
        assertEquals(3, actual);
    }

    @Test
    void equalsFive() {
        int[] arr = {2, 3, 5};
        int target = 10;
        int actual = test.findBestValue(arr, target);
        assertEquals(5, actual);
    }

    @Test
    void equalsOneOneThreeSixOne() {
        int[] arr = {60864, 25176, 27249, 21296, 20204};
        int target = 56803;
        int actual = test.findBestValue(arr, target);
        assertEquals(11361, actual);
    }
}