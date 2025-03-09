/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.h2106;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link MaximumFruitsHarvestedAfterAtMostKSteps}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/09/16 14:12
 */
class MaximumFruitsHarvestedAfterAtMostKStepsTest {
    private MaximumFruitsHarvestedAfterAtMostKSteps test;

    @BeforeEach
    void setUp() {
        test = new MaximumFruitsHarvestedAfterAtMostKSteps();
    }

    @Test
    void equalsNine() {
        int[][] fruits = {{2, 8}, {6, 3}, {8, 6}};
        int startPos = 5;
        int k = 4;
        assertEquals(9, test.maxTotalFruits(fruits, startPos, k));
    }

    @Test
    void equalsFourteen() {
        int[][] fruits = {{0, 9}, {4, 1}, {5, 7}, {6, 2}, {7, 4}, {10, 9}};
        int startPos = 5;
        int k = 4;
        assertEquals(14, test.maxTotalFruits(fruits, startPos, k));
    }

    @Test
    void equalsZero() {
        int[][] fruits = {{0, 3}, {6, 4}, {8, 5}};
        int startPos = 3;
        int k = 2;
        assertEquals(0, test.maxTotalFruits(fruits, startPos, k));
    }

    @Test
    void test4() {
        int[][] fruits = {{200000, 10000}};
        int startPos = 200000;
        int k = 200000;
        assertEquals(10000, test.maxTotalFruits(fruits, startPos, k));
    }

    @Test
    void test5() {
        int[][] fruits = {{200000, 10000}};
        int startPos = 0;
        int k = 200000;
        assertEquals(10000, test.maxTotalFruits(fruits, startPos, k));
    }
}