/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for {@link CountingBits_338}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/01/08 14:22
 */
class CountingBits_338Test {
    private CountingBits_338 test;

    private final int[] expectedBitsInTwo = {0, 1, 1};
    private final int[] expectedBitsInFive = {0, 1, 1, 2, 1, 2};

    @BeforeEach
    void setUp() {
        test = new CountingBits_338();
    }

    @Test
    void countForTwo() {
        int[] bitsInTwo = test.countBits(2);
        assertArrayEquals(expectedBitsInTwo, bitsInTwo);
    }

    @Test
    void countForFive() {
        int[] bitsInFive = test.countBits(5);
        assertArrayEquals(expectedBitsInFive, bitsInFive);
    }
}